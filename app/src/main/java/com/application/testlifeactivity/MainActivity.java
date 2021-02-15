package com.application.testlifeactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final String TAG = "StartActivity";
    TextView logArea; //логгер в приложении

    private Integer count = 5;
    /**
     * Вызывается при первом запуске приложения, создает activity
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logArea = findViewById(R.id.logArea);
        logArea.setText(logArea.getText() + "\nOnCreate()");
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate() executed", Toast.LENGTH_LONG).show();

    }
    /**
     * Вызывается при запуске приложения, после создания ее activity
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
        Toast.makeText(this, "onStart() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnStart()");
    }
    /**
     * Вызывается при выходе из другого состояния (свернутое и приостановленное состояние)
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnResume()");
    }
    /**
     * Вызывается при сворачивании приложения
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "onPause() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnPause()");
    }
    /**
     * Вызывается при остановке activity, сворачивании приложения (сохранить активность)
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "onStop() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnStop()");
    }
    /**
     * Вызывается при уничтожении activity
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnRestart()");
    }

    /**
     * Вызывается при уничтожении activity
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy() executed", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nOnDestroy()");
    }

    /**
     * Вызывается, когда нужно сохранить activity
     * @param outState - текущее состояние
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "Instance state has been saved.", Toast.LENGTH_LONG).show();
        logArea.setText(logArea.getText() + "\nInstance state has been saved.");
    }

    /**
     * Восстанавливаем состояние
     * @param savedInstanceState - сохраненное состояние
     */
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

    /**
     * Обновляем пользовательский интерфейс
     */
    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(count.toString());
        Log.d(TAG, "resetUI");
        Toast.makeText(this, "resetUI", Toast.LENGTH_LONG).show();
    }


}
