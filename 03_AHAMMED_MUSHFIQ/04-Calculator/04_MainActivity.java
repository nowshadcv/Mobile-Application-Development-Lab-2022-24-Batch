package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float first,second;
    boolean add,sub,mult,divi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button zero = (Button)findViewById(R.id.zero);
        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);
        Button dot = (Button)findViewById(R.id.dot);
        Button c = (Button)findViewById(R.id.c);
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        Button div = (Button)findViewById(R.id.div);
        Button mul = (Button)findViewById(R.id.mult);
        Button equal = (Button)findViewById(R.id.equal);
        EditText result = (EditText)findViewById(R.id.input);


        zero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
             result.setText(result.getText()+"0");
        }
    });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first = Float.parseFloat(result.getText()+"");
                    add = true;
                    result.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first = Float.parseFloat(result.getText()+"");
                    sub = true;
                    result.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first = Float.parseFloat(result.getText()+"");
                    mult = true;
                    result.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first = Float.parseFloat(result.getText()+"");
                    divi = true;
                    result.setText(null);
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true){
                    second = Float.parseFloat(result.getText()+"");
                    result.setText(first+second+"");
                    add = false;
                }
                if(sub==true){
                    second = Float.parseFloat(result.getText()+"");
                    result.setText(first-second+"");
                    sub=false;
                }
                if(mult==true){
                    second = Float.parseFloat(result.getText()+"");
                    result.setText(first*second+"");
                    mult=false;
                }
                if(divi==true){
                    second = Float.parseFloat(result.getText()+"");
                    result.setText(first/second+"");
                    divi=false;
                }
            }
        });
    }
}