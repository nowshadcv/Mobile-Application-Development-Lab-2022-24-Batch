package com.example.alc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","oncreate invoked");
    }
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    protected void onResume()
    {
        super.onStart();
        Log.d("lifecycle","onResume invoked");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("Lifecycle","onPause invoked");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("Lifecycle","onStop invoked");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }

}