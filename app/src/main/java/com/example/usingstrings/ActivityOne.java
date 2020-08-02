package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView txt2= findViewById(R.id.textView2);
        txt2.setText(R.string.Msg2);

        Log.i("LifeCycle","OnCreate called...");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle", "OnStart called" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle", "OnResume Called" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle", "onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle" , "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroy is called");
    }
}