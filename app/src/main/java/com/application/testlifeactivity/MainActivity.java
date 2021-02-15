package com.application.testlifeactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final String TAG = "StartActivity";
    TextView logArea;

    private Integer count = 5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logArea = findViewById(R.id.logArea);
        logArea.setText(logArea.getText() + "\nOnCreate()");
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate() executed", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
        Toast.makeText(this, "onStart() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "onPause() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "onStop() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "Instance state has been saved.", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nInstance state has been saved.");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
        Toast.makeText(this, "Instance state has been restored.", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nInstance state has been restored.");

    }

    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(count.toString());
        Log.d(TAG, "resetUI");
        Toast.makeText(this, "resetUI", Toast.LENGTH_LONG).show();
    }


}
