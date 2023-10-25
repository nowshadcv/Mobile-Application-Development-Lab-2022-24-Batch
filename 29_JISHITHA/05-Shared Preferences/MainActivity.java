package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameEt,mobileEt,emailEt,password1Et,password2Et;
    Button submitBtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEt=(EditText) findViewById(R.id.username);
        mobileEt=(EditText) findViewById(R.id.mobile);
        emailEt=(EditText) findViewById(R.id.email);
        password1Et=(EditText) findViewById(R.id.password1);
        password2Et=(EditText) findViewById(R.id.password2);
        submitBtn=(Button) findViewById(R.id.submitBtn);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor= sharedPreferences.edit();
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usernameEt.getText().toString().trim();
                int mobile=Integer.parseInt(mobileEt.getText().toString().trim());
                String email=emailEt.getText().toString().trim();
                String password1=password1Et.getText().toString().trim();
                String password2=password2Et.getText().toString().trim();
                if (username.isEmpty()){
                    usernameEt.setError("Username is Empty");
                    usernameEt.requestFocus();
                    return;
                }
                if (email.isEmpty()){
                    emailEt.setError("Input Email");
                    emailEt.requestFocus();
                    return;
                }
                if (password2.isEmpty()){
                    password1Et.setError("Enter Password");
                    password1Et.requestFocus();
                    return;
                }
                if (password1.length()<6){
                    password1Et.setError("Length must be minimum 6 characters");
                    password1Et.requestFocus();
                    return;
                }
                if (password2.equals(password1)){
                    password2Et.setError("Password not matched");
                    password2Et.requestFocus();
                    return;
                }
                Toast toast=Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_LONG);
                editor.putString("keyusername",username);
                editor.putInt("keymobile",mobile);
                editor.putString("keyemail",email);
                editor.putString("keypassword",password2);
                editor.apply();
            }
        });

    }
}