package edu.washington.nickclaw.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lifecycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle", "onStart event fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle", "onRestart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycle", "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle", "onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle", "onStop event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle", "onDestroy");
        Log.e("lifecycle", "We’re going down, Captain!");
    }
}
