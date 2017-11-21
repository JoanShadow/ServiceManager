package com.example.joan.servicemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBlockMainThread = findViewById(R.id.btnBlockMainThread);
        btnBlockMainThread.setOnClickListener(this);

        //blockMainThread();
    }

    private void blockMainThread() {
        //int i = 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*while (i <10000000) {
            Log.d(MainActivity.class.getSimpleName(), "While position = " + i);
            i++;
        }*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBlockMainThread:
                blockMainThread();
                break;
        }
    }
}