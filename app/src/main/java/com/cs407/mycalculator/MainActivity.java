package com.cs407.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        Button myButton = (Button) findViewById(view.getId());

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), myButton.getText().toString());
    }

    public void goToActivity(String s, String y, String j){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("num1", s);
        intent.putExtra("num2", y);
        intent.putExtra("operation", j);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}