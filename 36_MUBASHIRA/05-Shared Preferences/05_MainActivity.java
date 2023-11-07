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
EditText uname,mob,eml,pass1,pass2;
Button btn2;
SharedPreferences sharedPreferences;
SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText) findViewById(R.id.username);
        eml=(EditText) findViewById(R.id.email);
        pass1=(EditText) findViewById(R.id.password);
        pass2=(EditText) findViewById(R.id.retype);
        btn2=(Button) findViewById(R.id.btn1);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String username=uname.getText().toString().trim();
                int mobile=Integer.parseInt(mob.getText().toString().trim());
                String email=eml.getText().toString().trim();
                String password=pass1.getText().toString().trim();
                String retype=pass2.getText().toString().trim();
                if(username.isEmpty()){
                    uname.setError("Username is empty");
                    uname.requestFocus();
                    return;
                }
                if(email.isEmpty()) {
                    eml.setError("Input email");
                    eml.requestFocus();
                    return;
                }
                if (password.isEmpty()){
                    pass1.setError("Enter Password");
                    pass1.requestFocus();
                    return;
                }
                if(password.length() < 6){
                    pass2.setError("Length must be minimum 6 characters");
                    pass2.requestFocus();
                    return;
                }
                if(!retype.equals(password)){
                    pass2.setError("Password not Matched");
                    pass2.requestFocus();
                    return;
                }
                Toast toast=Toast.makeText(getApplicationContext(),"Registration Successful", Toast.LENGTH_LONG);
                editor.putString("keyusername",username);
                editor.putInt("keymobile",mobile);
                editor.putString("keyemail",email);
                editor.putString("keypassword",retype);
                editor.apply();

            }
        });
    }
}