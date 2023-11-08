package com.example.toggleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView) findViewById(R.id.img1);
        img2=(ImageView) findViewById(R.id.img2);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.img1){
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }
        else{
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }

    }
}