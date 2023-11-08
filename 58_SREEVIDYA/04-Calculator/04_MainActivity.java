package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btnadd,btnsub,btnmul,btndiv,btneql,btnC;
    EditText result;
    float mValueOne,mValueTwo;
    boolean addition,subtract,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn10=(Button) findViewById(R.id.btn10);
        btnadd=(Button) findViewById(R.id.btnadd);
        btnsub=(Button) findViewById(R.id.btnsub);
        btnmul=(Button) findViewById(R.id.btnmul);
        btndiv=(Button) findViewById(R.id.btndiv);
        btnC=(Button) findViewById(R.id.btnC);
        btneql=(Button) findViewById(R.id.btneql);
        result=(EditText) findViewById(R.id.edt1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    addition = true;
                    result.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null) {
                    result.setText("");
                }else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    subtract = true;
                    result.setText(null);
                }

            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null) {
                    result.setText("");
                }else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    multiplication = true;
                    result.setText(null);
                }

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null) {
                    result.setText("");
                }else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    division = true;
                    result.setText(null);
                }

            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(result.getText() + "");
                if (addition == true) {
                    result.setText(mValueOne + mValueTwo + "");
                    addition = false;
                }
                if (subtract == true) {
                    result.setText(mValueOne - mValueTwo + "");
                    subtract = false;

                }
                if (multiplication == true) {
                    result.setText(mValueOne * mValueTwo + "");
                    multiplication = false;
                }
                if (division == true) {
                    result.setText(mValueOne / mValueTwo + "");
                    division = false;
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ ".");
            }
        });

    }
}