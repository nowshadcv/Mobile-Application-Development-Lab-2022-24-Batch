package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,mobileno,email,password,cpassword;
    Button submitbtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        mobileno=(EditText) findViewById(R.id.mobileNo);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        cpassword=(EditText) findViewById(R.id.cpassword);
        submitbtn=(Button) findViewById(R.id.loginBtn);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submitbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1 = username.getText().toString().trim();
                int mobile = Integer.parseInt(mobileno.getText().toString().trim());
                String email1 = email.getText().toString().trim();
                String pass1 = password.getText().toString().trim();
                String pass2 = cpassword.getText().toString().trim();
                if (username1.isEmpty()) {
                    username.setError("username is empty");
                    username.requestFocus();
                    return;
                }
                if (email1.isEmpty()) {
                    email.setError("input email");
                    email.requestFocus();
                    return;
                }
                if (pass2.isEmpty()) {
                    cpassword.setError("Enter password");
                    cpassword.requestFocus();
                    return;
                }
                if (pass1.length() < 6) {
                    password.setError("Length must be minimum 6 characters");
                    password.requestFocus();
                    return;
                }
                if (!pass2.equals(pass1)) {
                    cpassword.setError("password not matched");
                    cpassword.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this,"Registration Successful", Toast.LENGTH_LONG).show();
                editor.putString("keyusername", username1);
                editor.putInt("keymobile", mobile);
                editor.putString("keyemail", email1);
                editor.putString("keypassword", pass2);
                editor.apply();
            }
        }));
    }
}