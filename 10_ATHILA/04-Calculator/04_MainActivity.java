package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,
            button5,button6,button7,button8,button9,
            button10,buttonAdd,buttonSub,buttonMul,
            buttonDiv,buttonEql,buttonC;
    EditText result;
    float mValueOne,mValueTwo;
    boolean addition,substract,multiplication,division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button10=(Button)findViewById(R.id.button10);
        buttonAdd=(Button)findViewById(R.id.buttonadd);
        buttonSub=(Button)findViewById(R.id.buttonsub);
        buttonMul=(Button)findViewById(R.id.buttonmul);
        buttonDiv=(Button)findViewById(R.id.buttondiv);
        buttonEql=(Button)findViewById(R.id.buttoneql);
        buttonC=(Button)findViewById(R.id.buttonC);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
    });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(result==null){
                        result.setText("");

                    }else
                        mValueOne=Float.parseFloat(result.getText()+"");
                    addition=true;
                result.setText(null);

            }

    });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");

                }
                else
                    mValueOne=Float.parseFloat(result.getText()+"");
                substract=true;
                result.setText(null);

            }

        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");

                }
                else
                    mValueOne=Float.parseFloat(result.getText()+"");
                multiplication=true;
                result.setText(null);

            }

        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");

                }
                else
                    mValueOne=Float.parseFloat(result.getText()+"");
                division=true;
                result.setText(null);

            }

        });
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo=Float.parseFloat(result.getText()+"");
                if (addition == true) {
                    result.setText(mValueOne+mValueTwo+"");
                    addition=false;
                }
                if (substract == true) {
                    result.setText(mValueOne-mValueTwo+"");
                    substract=false;
                }
                if (multiplication == true) {
                    result.setText(mValueOne * mValueTwo+"");
                    multiplication=false;
                }
                if (division == true) {
                    result.setText(mValueOne/mValueTwo+"");
                    division=false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });

    }

}