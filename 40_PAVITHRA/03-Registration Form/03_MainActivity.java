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
        TextView username = (TextView) findViewById(R.id.Username);
        TextView email = (TextView) findViewById(R.id.email);
        TextView password1 = (TextView) findViewById(R.id.password1);
        TextView password2 = (TextView) findViewById(R.id.password2);
        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String username1 = username.getText().toString();
            Toast.makeText(MainActivity.this,"Username is "+username1,Toast.LENGTH_SHORT).show();
        }
        });
    }
}
