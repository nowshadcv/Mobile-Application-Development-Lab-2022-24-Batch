package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
float first,second;
    boolean add = false,sub=false,divi,mult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText input=(EditText)findViewById(R.id.input);
        Button one=(Button) findViewById(R.id.one);
        Button two=(Button) findViewById(R.id.two);
        Button three=(Button) findViewById(R.id.three);
        Button four=(Button) findViewById(R.id.four);
        Button five=(Button) findViewById(R.id.five);
        Button six=(Button) findViewById(R.id.six);
        Button seven=(Button) findViewById(R.id.seven);
        Button eight=(Button) findViewById(R.id.eight);
        Button nine=(Button) findViewById(R.id.nine);
        Button zero=(Button) findViewById(R.id.zero);
        Button plus=(Button) findViewById(R.id.plus);
        Button minus=(Button) findViewById(R.id.minus);
        Button div=(Button) findViewById(R.id.div);
        Button mul=(Button) findViewById(R.id.mul);
        Button equal=(Button) findViewById(R.id.equal);
        Button dot=(Button) findViewById(R.id.dot);
        Button C=(Button) findViewById(R.id.C);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input.setText(input.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+".");
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input==null){
                    input.setText("");
                }
                else {
                   first =Float.parseFloat(input.getText().toString()+"");
                   add=true;
                  input.setText("");
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input==null){
                    input.setText("");
                }
                else {
                     first =Float.parseFloat(input.getText().toString()+"");
                     sub=true;
                    input.setText("");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input==null){
                    input.setText("");
                }
                else {
                     first =Float.parseFloat(input.getText().toString()+"");
                     divi=true;
                    input.setText("");
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input==null){
                    input.setText("");
                }
                else {
                     first =Float.parseFloat(input.getText().toString()+"");
                     mult=true;
                    input.setText("");
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true){
                     second=Float.parseFloat(input.getText().toString()+"");

                    input.setText(first+second+"");
                    add=false;
                }
                if(sub==true){
                    second=Float.parseFloat(input.getText().toString()+"");

                    input.setText((first-second+""));
                    sub=false;
                }
                if(divi==true){
                    second=Float.parseFloat(input.getText().toString()+"");

                    input.setText((first/second+""));
                    divi=false;
                }
                if(mult==true){
                    second=Float.parseFloat(input.getText().toString()+"");

                    input.setText( (first*second+""));
                    mult=false;
                }

            }
        });




    }
}