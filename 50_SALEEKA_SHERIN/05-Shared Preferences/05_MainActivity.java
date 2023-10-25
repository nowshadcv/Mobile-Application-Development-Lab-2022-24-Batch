package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText usernameEt,mobileEt,emailEt,pass1Et,pass2Et;
    Button submitBtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEt=(EditText) findViewById(R.id.username);
        mobileEt=(EditText) findViewById(R.id.mobno);
        emailEt=(EditText) findViewById(R.id.email);
        pass1Et=(EditText) findViewById(R.id.password);
        pass2Et=(EditText) findViewById(R.id.rpassword);
        submitBtn=(Button) findViewById(R.id.loginbtn);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernames=usernameEt.getText().toString().trim();
                int mobilei=Integer.parseInt(mobileEt.getText().toString().trim());
                String emails=emailEt.getText().toString().trim();
                String pass1s=pass1Et.getText().toString().trim();
                String pass2s=pass2Et.getText().toString().trim();
                if (usernames.isEmpty())
                {
                    usernameEt.setError("Username is Empty");
                    usernameEt.requestFocus();
                    return;
                }
                if(emails.isEmpty())
                {
                    emailEt.setError("Input Email");
                    emailEt.requestFocus();
                    return;
                }
                if(pass1s.isEmpty())
                {
                    pass1Et.setError("Enter Password");
                    pass1Et.requestFocus();
                    return;
                }
                if (pass2s.isEmpty())
                {
                    pass2Et.setError("Enter Password");
                    pass2Et.requestFocus();
                    return;
                }
                if (pass1s.length()<6)
                {
                    pass1Et.setError("Length must be minimum 6 characters");
                    pass1Et.requestFocus();
                    return;
                }
                if(!pass1s.equals(pass2s))
                {
                    pass2Et.setError("Password not Matched");
                    pass2Et.requestFocus();
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