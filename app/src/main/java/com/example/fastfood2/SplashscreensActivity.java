package com.example.fastfood2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashscreensActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 2000; // 2 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreens);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashscreensActivity.this, login.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}