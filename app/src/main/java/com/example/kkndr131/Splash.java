package com.example.kkndr131;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    long delay = 2999;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer jalankanSplash = new Timer();

        TimerTask tampilkanSplash = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
            }
        };
        jalankanSplash.schedule(tampilkanSplash,delay);
    }
}