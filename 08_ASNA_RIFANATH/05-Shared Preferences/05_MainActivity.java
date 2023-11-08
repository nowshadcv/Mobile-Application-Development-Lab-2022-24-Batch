package com.example.sharedpreferencce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,mobilenum,emailid,pass1,pass2;
    Button submitbtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.username);
        emailid = (EditText) findViewById(R.id.email);
        mobilenum = (EditText) findViewById(R.id.mobile);
        pass1 = (EditText) findViewById(R.id.password);
        pass2 = (EditText) findViewById(R.id.confrmpswd);
        submitbtn =(Button) findViewById(R.id.submit);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernames=uname.getText().toString().trim();
                int mobilei=Integer.parseInt(mobilenum.getText().toString().trim());
                String emails=emailid.getText().toString().trim();
                String pass1s=pass1.getText().toString().trim();
                String pass2s=pass2.getText().toString().trim();
                if (usernames.isEmpty())
                {
                    uname.setError("Username is Empty");
                    uname.requestFocus();
                    return;
                }
                if(emails.isEmpty())
                {
                    emailid.setError("Input Email");
                    emailid.requestFocus();
                    return;
                }
                if(pass1s.isEmpty())
                {
                    pass1.setError("Enter Password");
                    pass1.requestFocus();
                    return;
                }
                if (pass2s.isEmpty())
                {
                    pass2.setError("Enter Password");
                    pass2.requestFocus();
                    return;
                }
                if (pass1s.length()<6)
                {
                    pass1.setError("Length must be minimum 6 characters");
                    pass1.requestFocus();
                    return;
                }
                if(!pass1s.equals(pass2s))
                {
                    pass2.setError("Password not Matched");
                    pass2.requestFocus();
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

