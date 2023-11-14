package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onIndexSendButtonClicked(View v){
        Intent intent = new Intent( this,SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextindex);
        String index = editText.getText().toString();
        intent.putExtra("ImageIndex",index);
        startActivity(intent);

    }
}