package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username=(TextView)findViewById(R.id.username);
        TextView email=(TextView)findViewById(R.id.email);
        TextView password=(TextView) findViewById(R.id.password);
        TextView cpassword=(TextView)findViewById(R.id.cpassword) ;
        Button submitbtn =(Button) findViewById(R.id.submitbtn);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1 = username.getText().toString();
                Toast.makeText(MainActivity.this, "username is" + username.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}