package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String imgIndex = bundle.getString("ImageIndex");
            setImage(imgIndex);
        }
    }
    private void setImage(String index){
        ImageView imageView = (ImageView)  findViewById(R.id.imageViewCountry);
        switch(index){
            case "1":
                imageView.setImageResource(R.drawable.india);
                break;
            case "2":
                imageView.setImageResource(R.drawable.sa);
                break;
            case "3":
                imageView.setImageResource(R.drawable.nz);
                break;
            case "4":
                imageView.setImageResource(R.drawable.aus);
                break;

        }
    }
}