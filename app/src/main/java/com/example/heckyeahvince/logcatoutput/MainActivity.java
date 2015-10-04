package com.example.heckyeahvince.logcatoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_MSG = "MainActivity";

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.d(DEBUG_MSG, "onSaveInstanceState() method was called. (Maayos na natawag ang onSaveInstanceState())");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(DEBUG_MSG, "onStop() method was called. (Maayos na natawag ang onStop())");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(DEBUG_MSG, "onRestart() method was called. (Maayos na natawag ang onRestart())");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUG_MSG, "onStart() method was called. (Maayos na natawag ang onStart())");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DEBUG_MSG, "onPause() method was called. (Maayos na natawag ang onPause())");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DEBUG_MSG, "onResume() method was called. (Maayos na natawag ang onResume())");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(DEBUG_MSG, "onDestroy() method was called. (Maayos na natawag ang onDestroy())");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(DEBUG_MSG, "onCreate() method was called. (Maayos na natawag ang onCreate())");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.d(DEBUG_MSG, "onCreateOptionsMenu() method was called. (Maayos na natawag ang onCreateOptionsMenu())");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        Log.d(DEBUG_MSG, "onOptionsItemSelected() method was called. (Maayos na natawag ang onOptionsItemSelected())");
        return super.onOptionsItemSelected(item);
    }
}
