package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    String fruitlist []={"apple","orange","banana","pomegranete","dates"};
    ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=findViewById(R.id.listview);
        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<>(this,R.layout.activity_listview,R.id.textview,fruitlist);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(MainActivity.this,Apple.class));
                }
                else if(position==1){
                    startActivity(new Intent(MainActivity.this,orange.class));
                }
                else if(position==2){
                    startActivity(new Intent(MainActivity.this,banana.class));
                }
                else if(position==3){
                    startActivity(new Intent(MainActivity.this,pomegranate.class));
                }
                else {
                    startActivity(new Intent(MainActivity.this, dates.class));
                }



                Log.i("ListView","Item is clicked @position"+position);
            }
        });

    }
}