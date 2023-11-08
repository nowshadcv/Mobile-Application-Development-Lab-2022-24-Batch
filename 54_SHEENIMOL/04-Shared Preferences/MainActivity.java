package com.example.sharedpreference;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,mobile,email,password,repassword;
    Button submit;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        mobile=(EditText) findViewById(R.id.mobile);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        repassword=(EditText) findViewById(R.id.repassword);
        submit=(Button) findViewById(R.id.submit);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernames=username.getText().toString().trim();
                int mobilei=Integer.parseInt(mobile.getText().toString().trim());
                String emails=email.getText().toString().trim();
                String pass1s=password.getText().toString().trim();
                String pass2s=repassword.getText().toString().trim();
                if (usernames.isEmpty())
                {
                    username.setError("Username is Empty");
                    username.requestFocus();
                    return;
                }
                if(emails.isEmpty())
                {
                    email.setError("Input Email");
                    email.requestFocus();
                    return;
                }
                if(pass1s.isEmpty())
                {
                    password.setError("Enter Password");
                    password.requestFocus();
                    return;
                }
                if (pass2s.isEmpty())
                {
                    repassword.setError("Enter Password");
                    repassword.requestFocus();
                    return;
                }
                if (pass1s.length()<6)
                {
                    password.setError("Length must be minimum 6 characters");
                    password.requestFocus();
                    return;
                }
                if(!pass1s.equals(pass2s))
                {
                    repassword.setError("Password not Matched");
                    repassword.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this,"Registration Successfl",Toast.LENGTH_LONG).show();
                editor.putString("keyusername",usernames);
                editor.putInt("keymobile",mobilei);
                editor.putString("keyemail",emails);
                editor.putString("keypassword",pass2s);
                editor.apply();
            }
        });
    }
}