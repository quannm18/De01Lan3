package com.example.de01lan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar2;
    private int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar2.setMax(100);
        temp = 20;
        progressBar2.setProgress(temp);
        CountDownTimer cdt = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                temp+=40;
                progressBar2.setProgress(temp);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(MainActivity.this,Man2Activity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}