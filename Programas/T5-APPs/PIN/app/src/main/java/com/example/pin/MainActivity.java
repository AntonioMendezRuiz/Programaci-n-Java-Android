package com.example.pin;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View v)
    {
        Button b = (Button)v;
        final TextView tv = findViewById(R.id.pin);
        if(tv.getText().length() < 4)
        {
            tv.setTextColor(Color.BLACK);
            tv.setText(tv.getText().toString() + b.getText().toString());
        }
        if(tv.getText().length() == 4) {
            if (tv.getText().toString().contains("1234")) {
                tv.setTextColor(Color.GREEN);
            } else {
                tv.setTextColor(Color.RED);
            }

            int SPLASH_TIME_OUT = 1000; // Declear variable

            // Code in activity or fragment
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    tv.setText("");
                }
            }, SPLASH_TIME_OUT);
        }
    }
}
