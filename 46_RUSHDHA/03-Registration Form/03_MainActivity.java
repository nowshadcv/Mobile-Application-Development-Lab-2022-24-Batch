package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.username);
        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);
        TextView confirmpassword = (TextView) findViewById(R.id.confirmpassword);
        Button loginbtn = (Button)findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("123") && confirmpassword.getText().toString().equals("123")){
                    Toast.makeText(MainActivity.this,"Username is "+username.getText(),Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();

            }
        });



    }
}