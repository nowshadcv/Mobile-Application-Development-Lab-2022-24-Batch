// MainActivity.java
package com.example.arrayadapter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String fruitlist[] = {"apple", "orange", "banana", "pomegranate", "dates"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.text, fruitlist);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    startActivity(new Intent(MainActivity.this,Apple.class));
                }else if(position==1){
                    startActivity(new Intent(MainActivity.this,Orange.class));
                }else if(position==2){
                    startActivity(new Intent(MainActivity.this,Banana.class));
                }else if(position==3){
                    startActivity(new Intent(MainActivity.this,pomegranate.class));
                }else {
                    startActivity(new Intent(MainActivity.this,Dates.class));
                }
                Log.i("ListView", "item is clicked @position" + position);
            }
        });
    }
}


