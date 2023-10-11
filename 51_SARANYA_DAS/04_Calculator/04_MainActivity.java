package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttondot,buttonC,buttonadd,buttonsub,buttonmul,buttondiv,buttoneql;
    EditText result;
    float mvalueone,mvalueTwo;
    boolean addition,msubstract,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttondot = (Button) findViewById(R.id.buttondot);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttoneql = (Button) findViewById(R.id.buttoneql);
        result = (EditText) findViewById(R.id.edit1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "0");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    addition = true;
                    result.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    msubstract = true;
                    result.setText(null);
                }
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    multiplication = true;
                    result.setText(null);
                }
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    division = true;
                    result.setText(null);
                }
            }
        });
        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueTwo = Float.parseFloat(result.getText() + "");
                if (addition == true) {
                    result.setText(mvalueone + mvalueTwo+"");
                    addition = false;
                }
                if (msubstract == true) {
                    result.setText(mvalueone - mvalueTwo + "");
                    msubstract = false;
                }
                if (multiplication == true) {
                    result.setText(mvalueone * mvalueTwo + "");
                    multiplication = false;
                }
                if (division == true) {
                    result.setText(mvalueone / mvalueTwo + "");
                    division = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + ".");
            }
        });
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }*/
}