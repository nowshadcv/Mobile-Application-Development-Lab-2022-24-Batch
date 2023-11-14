package com.example.explicitintents;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.explicitintents.databinding.ActivitySecondActivitityBinding;

public class secondActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondActivitityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle=getIntent().getExtras();
        if(bundle != null) {
            String imgindex = bundle.getString("ImageIndex");
            setImage(imgindex);
        }}
    private void setImage(String index){
        ImageView imageView=(ImageView) findViewById(R.id.imageViewCountry);
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

