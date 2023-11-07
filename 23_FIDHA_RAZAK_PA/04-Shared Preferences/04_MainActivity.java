package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText usernameEt,mobileEt,emailEt,pass1Et,pass2Et;
    Button submitBtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEt=(EditText) findViewById(R.id.uname);
        mobileEt=(EditText) findViewById(R.id.number);
        emailEt=(EditText) findViewById(R.id.email);
        pass1Et=(EditText) findViewById(R.id.password);
        pass2Et=(EditText) findViewById(R.id.passwordI);
        submitBtn=(Button) findViewById(R.id.submit);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=usernameEt.getText().toString().trim();
                int number=Integer.parseInt(mobileEt.getText().toString().trim());
                String email=emailEt.getText().toString().trim();
                String password=pass1Et.getText().toString().trim();
                String passwordI=pass2Et.getText().toString().trim();
                if (uname.isEmpty()){
                    usernameEt.setError("Username is empty");
                    usernameEt.requestFocus();
                    return;
                }
                if (email.isEmpty()){
                    emailEt.setError("Input email");
                    emailEt.requestFocus();
                    return;
                }
                if (passwordI.isEmpty()){
                    pass1Et.setError("Enter password");
                    pass1Et.requestFocus();
                    return;
                }
                if (password.length()<6){
                    pass1Et.setError("Length must be minimum 6 characters");
                    pass1Et.requestFocus();
                    return;
                }
                if (!passwordI.equals(password)){
                    pass2Et.setError("Password not matched");
                    pass2Et.requestFocus();
                    return;
                }
                Toast toast=Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_LONG);
                editor.putString("Keyusername",uname);
                editor.putInt("Keymobile",number);
                editor.putString("Keyemail",email);
                editor.putString("Keypassword",passwordI);
                editor.apply();
            }
        });


    }
}
