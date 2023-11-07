package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Username,mobile,email,password1,password2;
    Button submitbtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username=(EditText) findViewById(R.id.Username);
        mobile=(EditText) findViewById(R.id.mobile);
        email=(EditText) findViewById(R.id.email);
        password1=(EditText) findViewById(R.id.password1);
        password2=(EditText) findViewById(R.id.password2);
        submitbtn=(Button) findViewById(R.id.submitbtn);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Uname=Username.getText().toString().trim();
                int mob= Integer.parseInt(mobile.getText().toString().trim());
                String mail= email.getText().toString().trim();
                String pswd1=password1.getText().toString().trim();
                String pswd2=password2.getText().toString().trim();
                if (Uname.isEmpty()){
                    Username.setError("Username is empty");
                    Username.requestFocus();
                    return;
                }
                if (mail.isEmpty()){
                    email.setError("Input email");
                    email.requestFocus();
                    return;
                }
                if (pswd2.isEmpty()){
                  password1.setError("Enter password");
                  password1.requestFocus();
                  return;

                }
                if (pswd1.length() < 6){
                    password1.setError("Length must be minimum 6 characters");
                    password1.requestFocus();
                    return;
                }
                if (!pswd2.equals(pswd1)){
                    password2.setError("password not matched");
                    password2.requestFocus();
                    return;
                }
               Toast.makeText(MainActivity.this,"Registration successful",Toast.LENGTH_LONG).show();
                editor.putString("Keyusername",Uname);
                editor.putInt("keymobile",mob);
                editor.putString("keyemail",mail);
                editor.putString("keypassword",pswd2);
                editor.apply();

            }
        });

    }
}