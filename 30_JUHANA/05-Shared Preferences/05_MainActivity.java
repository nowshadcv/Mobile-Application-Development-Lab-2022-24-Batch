package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content. SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity { EditText usernameEt, mobileEt, emailEt, passlEt, pass2Et; Button submitBtn;
    SharedPreferences sharedPreferences;
    SharedPreferences. Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        usernameEt= (EditText) findViewById(R.id.etusername);
        mobileEt= (EditText) findViewById(R.id.etmobile);
        emailEt= (EditText) findViewById(R.id.email);
        passlEt= (EditText) findViewById(R.id.pass1);
        pass2Et= (EditText) findViewById(R.id.pass2);
        submitBtn= (Button) findViewById(R.id.submitbtn);
        sharedPreferences=getSharedPreferences ("UserDetails", MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submitBtn.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usernameEt.getText().toString().trim();
                int mobile = Integer.parseInt (mobileEt.getText().toString().trim());

                String email = emailEt.getText().toString().trim();
                String passl =passlEt.getText().toString().trim();
                String pass2 = pass2Et.getText().toString().trim();
                if (username.isEmpty()) {

                    usernameEt.setError("Username is empty");
                    usernameEt.requestFocus();
                    return;
                }
                if (email.isEmpty()) {

                    emailEt.setError("Input email");
                    emailEt.requestFocus();
                    return;
                }
                if (pass2.isEmpty()) {
                    passlEt.setError("Enter Password");
                    passlEt.requestFocus();
                    return;
                }
                    if (passl.length() <6) {
                        passlEt.setError("Length must be minimum 6 characters");
                        passlEt.requestFocus();
                        return;
                    }
                        if (!pass2.equals (passl)) {
                            pass2Et.setError ("Password not matched");
                            pass2Et.requestFocus();
                            return;
                        }
                Toast.makeText(MainActivity.this,"Registration Successfl",Toast.LENGTH_LONG).show();                        editor.putString("keyusername", username);
                        editor.putInt ("keymobile", mobile);
                        editor.putString("keyemail", email);
                        editor.putString("keypasssword", pass2);
                        editor.apply();
                    }
                });
            }
        }




