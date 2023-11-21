
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

import com.example.explicitintents.databinding.ActivityMain2Binding;

import java.util.Set;

public class MainActivity2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String imgIndex = bundle.getString("ImageIndex");
            SetImage(imgIndex);
        }
    }
    private void SetImage(String index) {
        ImageView imageView = (ImageView) findViewById(R.id.imageViewCountry);
        switch (index){
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