package com.zainkhokhar.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        waitandgo();
    }

    private void waitandgo() {


        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                Toast.makeText(SplashScreen.this, "Welcome To Paint Master APP", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}