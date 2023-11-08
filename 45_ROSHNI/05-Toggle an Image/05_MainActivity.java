package com.example.toggleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageview1,image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview1=(ImageView)findViewById(R.id.imageview1);
        image2=(ImageView)findViewById(R.id.image2);
        imageview1.setOnClickListener(this);
        image2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      if(view.getId()==R.id.imageview1){
          imageview1.setVisibility(View.GONE);
          image2.setVisibility(View.VISIBLE);


      }
      else{
          image2.setVisibility(View.GONE);
          imageview1.setVisibility(View.VISIBLE);

      }

    }
}