package com.cs407.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String result = "";
        textView=(TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String op = intent.getStringExtra("operation");
        String num1 = intent.getStringExtra("num1");
        String num2 = intent.getStringExtra("num2");

        if(op.equals("+")){
            result = "" + (Double.parseDouble(num1) + Double.parseDouble(num2));
        }
        else if(op.equals("-")){
            result = "" + (Double.parseDouble(num1) - Double.parseDouble(num2));
        }
        else if(op.equals("*")){
            result = "" + (Double.parseDouble(num1) * Double.parseDouble(num2));
        }
        else if(op.equals("/")){
            if(num2.equals("0")){
                result = "Divide by 0 error";
            }
            else {
                result = "" + (Double.parseDouble(num1) / Double.parseDouble(num2));
            }
        }

        textView.setText(result);
    }
}