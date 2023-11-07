package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,mobile,email,pass1,pass2;
    Button button1;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText) findViewById(R.id.et1);
        mobile=(EditText) findViewById(R.id.et2);
        email=(EditText) findViewById(R.id.et3);
        pass1=(EditText) findViewById(R.id.et4);
        pass2=(EditText) findViewById(R.id.et5);
        button1=(Button)findViewById(R.id.b1);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String et1=uname.getText().toString().trim();
                int et2=Integer.parseInt(mobile.getText().toString().trim());
                String et3=email.getText().toString().trim();
                String et4=pass1.getText().toString().trim();
                String et5=pass2.getText().toString().trim();
                if(et1.isEmpty()){
                    uname.setError("username is empty");
                    uname.requestFocus();
                    return;
                }

                if(et3.isEmpty())
                {
                    email.setError("input email");
                    email.requestFocus();
                }
                if(et5.isEmpty()){
                    pass1.setError("enter password");
                    pass1.requestFocus();
                    return;
                }
                if(et4.length() <6){
                    pass1.setError("length must be minimum 6 characters");
                    pass1.requestFocus();
                    return;
                }
                if(!et5.equals(et4)){
                    pass2.setError("password is not matched");
                    pass2.requestFocus();
                    return;
                }
                Toast toast=Toast.makeText(getApplicationContext(),"Registration successfull",Toast.LENGTH_LONG);
                editor.putString("keyusername",et1);
                editor.putInt("Keymobile",et2);
                editor.putString("keyemail",et3);
                editor.putString("keypassword",et5);
                editor.apply();
            }
        });

    }
}