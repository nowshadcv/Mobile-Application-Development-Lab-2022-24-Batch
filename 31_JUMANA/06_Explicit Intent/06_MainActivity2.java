package com.example.explicitintents;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


import android.widget.ImageView;




public class MainActivity2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle=getIntent().getExtras();
                if(bundle!=null){
                    String imgIndex=bundle.getString("ImageIndex");
                    setImage(imgIndex);

                }
    }
    public void setImage(String index){
        ImageView imageView=(ImageView) findViewById(R.id.imgviewflag);
        switch (index){
            case "1":
                imageView.setImageResource(R.drawable.india);
                break;
            case "2":
                imageView.setImageResource(R.drawable.auz);
                break;
            case "3":
                imageView.setImageResource(R.drawable.nz);
                break;
            case "4":
                imageView.setImageResource(R.drawable.sa);
                break;




        }
    }


    }