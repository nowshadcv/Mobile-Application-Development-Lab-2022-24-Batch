package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String fruitlist[]={"apple","orange","banana","pomegranate","dates"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Pomegranate");
        list.add("dates");
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.i("listview","item is clicked @position"+position);
                if(position==0) {
                    startActivity(new Intent(MainActivity.this, Apple.class));
                }else if(position==1) {
                    startActivity(new Intent(MainActivity.this, orange.class));
                }else if(position==2) {
                    startActivity(new Intent(MainActivity.this, Banana.class));
                }else if(position==3) {
                    startActivity(new Intent(MainActivity.this, Pomegranate.class));
                }else if(position==4) {
                    startActivity(new Intent(MainActivity.this, Dates.class));
                }


                }


        });
    }
}