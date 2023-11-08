package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,mobile,email,password,cpassword;
    Button btn;

    SharedPreferences SharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        mobile=(EditText) findViewById(R.id.mobile);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        cpassword=(EditText) findViewById(R.id.cpassword);
        btn=(Button) findViewById(R.id.btn);

        SharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor= SharedPreferences.edit();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=name.getText().toString().trim();
                int mobile1=Integer.parseInt(mobile.getText().toString().trim());
                String email1=email.getText().toString().trim();
                String pass1=password.getText().toString().trim();
                String pass2=cpassword.getText().toString().trim();


                if (username.isEmpty()){
                    name.setError("User name is Empty");
                    name.requestFocus();
                    return;
                }
                if (email1.isEmpty()){
                    email.setError("Input Email");
                    email.requestFocus();
                    return;
                }
                if (pass1.isEmpty()){
                    password.setError("Enter Password");
                    password.requestFocus();
                    return;
                }
                if (pass2.isEmpty()){
                    cpassword.setError("Enter Password");
                    cpassword.requestFocus();
                    return;
                }
                if (pass1.length()<6){
                    password.setError("Length must be minimum 6 characters");
                    password.requestFocus();
                    return;
                }
                if (!pass1.equals(pass2)){
                    cpassword.setError("Password not matches");
                    cpassword.requestFocus();
                    return;
                }

                Toast.makeText(MainActivity.this,"Registration Successful",Toast.LENGTH_LONG).show();
                editor.putString("keyusername",username);
                editor.putInt("key ",mobile1);
                editor.putString("keyemail",email1);
                editor.putString("keypassword",pass2);
                editor.apply();
                
            }
        });


    }
}