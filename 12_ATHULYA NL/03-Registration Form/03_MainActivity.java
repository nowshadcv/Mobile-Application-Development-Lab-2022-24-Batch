package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username=(EditText)findViewById(R.id.username);
        EditText pass=(EditText)findViewById(R.id.password);
        EditText email=(EditText)findViewById(R.id.email);
        EditText confpass=(EditText)findViewById(R.id.confirmpass);
        Button btn =(Button)findViewById(R.id.loginbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pass.getText().toString().equals("123") && confpass.getText().toString().equals("123"))
                {
                    Toast.makeText(MainActivity.this, "Username is "+username.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Username Not Found.!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}