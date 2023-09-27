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
        TextView username=(TextView)findViewById(R.id.username);
        TextView gmail=(TextView)findViewById(R.id.email);
        TextView password=(TextView)findViewById(R.id.password);
        TextView cpassword=(TextView)findViewById(R.id.confirmpassword);
        Button loginbtn=(Button)findViewById(R.id.button);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("123456") && gmail.getText().toString().equals("sreevidyam07@gmail.com") && cpassword.getText().toString().equals("123456") ) {
                    Toast.makeText(MainActivity.this, "Username is "+username.getText(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();

                }
            }
    });
}
    }