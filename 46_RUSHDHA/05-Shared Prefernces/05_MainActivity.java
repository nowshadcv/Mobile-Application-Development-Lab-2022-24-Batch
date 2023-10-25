package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,mobile,email,password,repassword;
    Button submitbtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.uname);
        mobile=(EditText) findViewById(R.id.no);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.pwd);
        repassword=(EditText) findViewById(R.id.rpwd);
        submitbtn=(Button) findViewById(R.id.btn);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernamev=username.getText().toString().trim();
                int mobilev=Integer.parseInt(mobile.getText().toString().trim());
                String emailv=email.getText().toString().trim();
                String pass1=password.getText().toString().trim();
                String pass2=repassword.getText().toString().trim();
                if(usernamev.isEmpty())
                {
                    username.setError("Username is empty");
                    username.requestFocus();
                    return;
                }
                if(emailv.isEmpty())
                {
                    email.setError("Input email");
                    email.requestFocus();
                    return;
                }
                if(pass2.isEmpty())
                {
                    password.setError("Enter Password");
                    password.requestFocus();
                    return;
                }
                if(pass1.length()<6)
                {
                    password.setError("Length must be minimum 6 characters");
                    password.requestFocus();
                    return;
                }
                if(!pass2.equals(pass1))
                {
                    repassword.setError("Password not matched");
                    repassword.requestFocus();
                    return;
                }
                Toast toast=Toast.makeText(getApplicationContext(),"Registration Scuccessful",Toast.LENGTH_SHORT);
                editor.putString("Keyusername",usernamev);
                editor.putInt("Keymobile",mobilev);
                editor.putString("Keymail",emailv);
                editor.putString("Keypassword",pass2);
                editor.apply();
            }
        });
    }
}