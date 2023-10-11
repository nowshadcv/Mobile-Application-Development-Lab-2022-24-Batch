package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,buttonAdd,buttonSub,buttonMul,buttonDiv,buttonEql;
    EditText result;
    float mValueOne,mValueTwo;
    boolean addition,subtract,multiplication,division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(EditText) findViewById(R.id.edt1);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.buttondot);
        button11=(Button) findViewById(R.id.buttonzero);
        button12=(Button) findViewById(R.id.buttonc);
        buttonAdd=(Button) findViewById(R.id.buttonadd);
        buttonSub=(Button) findViewById(R.id.buttonsub);
        buttonMul=(Button) findViewById(R.id.buttonmul);
        buttonDiv=(Button) findViewById(R.id.buttondiv);
        buttonEql=(Button) findViewById(R.id.buttoneql);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText(null);
                }
                else{
                    mValueOne=Float.parseFloat(result.getText().toString()+"");
                    addition=true;
                    result.setText("");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText().toString()+"");
                    subtract=true;
                    result.setText("");
                }

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText().toString()+"");
                     multiplication=true;
                    result.setText("");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(result.getText().toString()+"");
                    division=true;
                    result.setText("");
                }
            }
        });
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(addition=true){
                    mValueTwo=Float.parseFloat(result.getText().toString()+"");
                    result.setText(mValueOne+mValueOne+"");
                    addition=false;
                }
                if(subtract=true) {
                    mValueTwo = Float.parseFloat(result.getText().toString() + "");
                    result.setText(mValueOne + mValueOne + "");
                    subtract = false;
                }
                if(multiplication=true) {
                    mValueTwo = Float.parseFloat(result.getText().toString() + "");
                    result.setText(mValueOne + mValueOne + "");
                    multiplication = false;
                }
                if(division=true) {
                    mValueTwo = Float.parseFloat(result.getText().toString() + "");
                    result.setText(mValueOne + mValueOne + "");
                    division = false;
                }
            }

        });





    }
}