package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText un,mn,email,pass,pass2;
    Button Btn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=(EditText) findViewById(R.id.edt1);
        mn=(EditText) findViewById(R.id.edt2);
        email=(EditText) findViewById(R.id.edt3);
        pass=(EditText) findViewById(R.id.edt4);
        pass2=(EditText) findViewById(R.id.edt5);
        Btn=(Button) findViewById(R.id.btn);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = un.getText().toString().trim();
                int mobile = Integer.parseInt(mn.getText().toString().trim());
                String eemail=email.getText().toString().trim();
                String p1=pass.getText().toString().trim();
                String p2=pass2.getText().toString().trim();

                if (username.isEmpty()) {
                    un.setError("Username is empty");
                    un.requestFocus();
                    return;
                }
                if (eemail.isEmpty()) {
                    email.setError("input email") ;
                    email.requestFocus();
                    return;
                }
                if (p1.isEmpty()) {
                    pass.setError("enter password");
                    pass.requestFocus();
                    return;
                }
                if (p2.isEmpty()) {
                    pass2.setError("enter password");
                    pass2.requestFocus();
                    return;
                }
                if (p1.length()<6)
                {
                    pass.setError("Length must be minimum 6 characters");
                    pass.requestFocus();
                    return;
                }
                if(!p1.equals(p2))
                {
                    pass2.setError("Password not Matched");
                    pass2.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this,"Registration Successfl",Toast.LENGTH_LONG).show();
                editor.putString("keyusername",username);
                editor.putInt("keymobile",mobile);
                editor.putString("keyemail",eemail);
                editor.putString("keypassword",p1);
                editor.apply();

            }
        });


    }
}