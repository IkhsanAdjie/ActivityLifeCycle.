package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "lifecycle", "onCreate invoked");
        Toast.makeText(this, "onCreate invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle", "onStart Invoked");
        Toast.makeText(this, "onStart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle", "onResume Invoked");
        Toast.makeText(this, "onResume invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle", "onPause Invoked");
        Toast.makeText(this, "onPause invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle", "onStop Invoked");
        Toast.makeText(this, "onStop invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle", "onRestart Invoked");
        Toast.makeText(this, "onRestart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle", "onDestroy Invoked");
        Toast.makeText(this, "onDestroy invoked", Toast.LENGTH_SHORT).show();
    }
}