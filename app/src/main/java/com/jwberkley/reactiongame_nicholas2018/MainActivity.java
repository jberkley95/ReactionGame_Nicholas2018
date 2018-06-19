package com.jwberkley.reactiongame_nicholas2018;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mainButton, startButton;
    long startTime, endTime, currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = (Button) findViewById(R.id.mainbutton);
        startButton = (Button) findViewById(R.id.startButton);
        mainButton.setBackgroundColor(Color.RED);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startButton.setEnabled(false);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startTime = System.currentTimeMillis();
                        mainButton.setBackgroundColor(Color.GREEN);
                        mainButton.setText("CLICK!");
                        mainButton.setEnabled(true);
                    }
                }, (int) (Math.random() * 3000) + 1000);
            }
        });

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endTime = System.currentTimeMillis();
                currentTime = endTime - startTime;
                mainButton.setBackgroundColor(Color.RED);
                mainButton.setText(currentTime + " ms ");
                startButton.setEnabled(true);
                mainButton.setEnabled(false);
            }
        });
    }
}
