package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText User1,mes1,mobi1,email,Pass1,password1;
    Button submitbtn;
    SharedPreferences Sharedpreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User1=(EditText)findViewById(R.id.user1);
        mobi1=(EditText)findViewById(R.id.mobi1);
        email=(EditText)findViewById(R.id.email);
        Pass1=(EditText)findViewById(R.id.Pass1);
        password1=(EditText)findViewById(R.id.password1);
        submitbtn=(Button)findViewById(R.id.submitbtn);
        Sharedpreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=Sharedpreferences.edit();
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username=User1.getText().toString().trim();
                int mobile = Integer.parseInt(mobi1.getText().toString().trim());
                String email1 =email.getText().toString().trim();
                String  passwd = Pass1.getText().toString().trim();
                String password2 = password1.getText().toString().trim();
                if (Username.isEmpty()){
                    User1.setError("Username is empty");
                    User1.requestFocus();
                    return;

                }
                if(email1.isEmpty()){
                    email.setError("Input Email");
                    email.requestFocus();
                    return;

                }
                if(password2.isEmpty()){
                    Pass1.setError("Enter password");
                    Pass1.requestFocus();
                    return;

                }
               if(passwd.length()<6){
                   Pass1.setError("Length must be minimum 6 characters");
                   Pass1.requestFocus();
                   return;

               }
               if(!password2.equals(passwd)){
                   password1.setError("password not matched");
                   password1.requestFocus();
                   return;

               }
               Toast toast =Toast.makeText(getApplicationContext(),"Registration successful",Toast.LENGTH_SHORT);
               editor.putString("keyusername",Username);
               editor.putInt("keymobileno",mobile);
               editor.putString("keyemail",email1);
               editor.putString("keypassword",password2);
               editor.apply();
            }
        });


    }
}