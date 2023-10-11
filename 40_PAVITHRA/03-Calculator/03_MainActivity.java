package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,
            button4,button5,button6,
            button7,button8,button9,
            button10,button11,button12,
            button13,buttonadd,buttonsub,
            buttonmul,buttondiv;
    EditText result;
    float mValueone,mValuetwo;
    boolean addition,msubtract,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        result = (EditText) findViewById(R.id.edt1);
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
                result.setText(result.getText()+"C");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mValuetwo=Float.parseFloat(result.getText()+"");
               if(addition == true){
                   result.setText(mValueone+mValuetwo+"");
                   addition=false;

               }
               if(msubtract==true){
                   result.setText(mValueone-mValuetwo+"");
                   msubtract=false;

               }
                if(multiplication == true){
                    result.setText(mValueone*mValuetwo+"");
                    multiplication=false;

                }
                if(division == true){
                    result.setText(mValueone/mValuetwo+"");
                  division=false;

                }
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }else
                    mValueone = Float.parseFloat(result.getText() +"");
                addition=true;
                result.setText(null);
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(result==null)
               {
                   result.setText("");
               }else{
                   mValueone=Float.parseFloat(result.getText()+"");
                   msubtract=true;
                   result.setText(null);
               }
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null)
                {
                    result.setText("");
                }else{
                    mValueone=Float.parseFloat(result.getText()+"");
                    division=true;
                    result.setText(null);
                }
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null)
                {
                    result.setText("");
                }else{
                    mValueone=Float.parseFloat(result.getText()+"");
                    multiplication=true;
                    result.setText(null);
                }
            }
        });


    }
}