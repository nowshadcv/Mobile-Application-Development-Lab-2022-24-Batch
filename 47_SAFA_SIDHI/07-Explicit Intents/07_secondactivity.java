package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String imgindex = bundle.getString("ImageIndex");
            setImage(imgindex);
        }
    }
    private void setImage(String index){
        ImageView imageView =(ImageView)findViewById(R.id.imageviewCountry) ;
        switch(index){
            case"1":
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