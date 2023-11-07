package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
        

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,
            button8,button9,button10,button11,button12,button13,button14,
            button15,button16,button17;
    EditText result;
    float mValueOne,mValueTwo;
    boolean addition,subtract,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        button11=(Button) findViewById(R.id.button11);
        button12=(Button) findViewById(R.id.button12);
        button13=(Button) findViewById(R.id.button13);
        button14=(Button) findViewById(R.id.button14);
        button15=(Button) findViewById(R.id.button15);
        button16=(Button) findViewById(R.id.button16);
        button17=(Button) findViewById(R.id.button17);
        result=(EditText) findViewById(R.id.edt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }});
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }});
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }});
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }});
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }});
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }});
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }});
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }});
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText()+"");
                    addition=true;
                    result.setText(null);
                }

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText()+"");
                    subtract=true;
                    result.setText(null);
                }

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText()+"");
                    multiplication=true;
                    result.setText(null);
                }

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText()+"");
                    division=true;
                    result.setText(null);
                }

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    result.setText("");
                }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + ".");



            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText()+"");
                    addition=true;
                    result.setText(null);
                }

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mValueTwo=Float.parseFloat(result.getText()+"");
                    if(addition=true){
                    result.setText(mValueOne + mValueTwo+"");
                    addition = false;
                }
                   if(subtract=true){
                    result.setText(mValueOne - mValueTwo+"");
                    subtract = false;
                }
                if(multiplication=true){
                    result.setText(mValueOne * mValueTwo+"");
                    multiplication = false;
                }
                if(division=true){
                    result.setText(mValueOne / mValueTwo+"");
                    division = false;
                }

            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText() + "0");
            }
        });
        }

    }
