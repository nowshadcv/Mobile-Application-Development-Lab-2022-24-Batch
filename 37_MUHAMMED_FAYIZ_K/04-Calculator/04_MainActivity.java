package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float mValueOne,mValueTwo;
    boolean addt,subt,mult,divs,clr,dott;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one =(Button)findViewById(R.id.btn1);
        Button two =(Button)findViewById(R.id.btn2);
        Button three =(Button)findViewById(R.id.btn3);
        Button add =(Button)findViewById(R.id.btnadd);
        Button four =(Button)findViewById(R.id.btn4);
        Button five =(Button)findViewById(R.id.btn5);
        Button six =(Button)findViewById(R.id.btn6);
        Button sub =(Button)findViewById(R.id.btnsub);
        Button seven =(Button)findViewById(R.id.btn7);
        Button eight =(Button)findViewById(R.id.btn8);
        Button nine =(Button)findViewById(R.id.btn9);
        Button mul =(Button)findViewById(R.id.btnmul);
        Button dot =(Button)findViewById(R.id.btndot);
        Button zero =(Button)findViewById(R.id.btn0);
        Button c =(Button)findViewById(R.id.btnc);
        Button div =(Button)findViewById(R.id.btndiv);
        Button equ =(Button)findViewById(R.id.btnequ);

        EditText result = (EditText) findViewById(R.id.input);

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
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(result.getText()+"");
                    addt=true;
                    result.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(result.getText()+"");
                    subt=true;
                    result.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(result.getText()+"");
                    mult=true;
                    result.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(result.getText()+"");
                    divs=true;
                    result.setText(null);
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(result.getText()+"");
                    clr=true;
                    result.setText(null);
                }
            }
        });
        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo=Float.parseFloat(result.getText()+"");
                if(addt==true){
                    result.setText(mValueOne+mValueTwo+"");
                    addt=false;
                }
                if(subt==true){
                    result.setText(mValueOne-mValueTwo+"");
                }
                if(mult==true){
                    result.setText(mValueOne*mValueTwo+"");
                }
                if(divs==true){
                    result.setText(mValueOne/mValueTwo+"");
                }
            }
        });
    }
}