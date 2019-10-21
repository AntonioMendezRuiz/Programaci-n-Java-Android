package com.example.adivino;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.menos).setEnabled(false);
        findViewById(R.id.igual).setEnabled(false);
        findViewById(R.id.mas).setEnabled(false);

        findViewById(R.id.empezar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.menos).setEnabled(true);
                findViewById(R.id.igual).setEnabled(true);
                findViewById(R.id.mas).setEnabled(true);
            }
        });

        findViewById(R.id.mas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.numero);
                Random rand = new Random();
                int min = Integer.parseInt(tv.getText().toString());
                int max = 100;
                int randomNum = rand.nextInt((max - min) + 1) + min;
                tv.setText(randomNum);
            }
        });
        findViewById(R.id.menos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.numero);
                Random rand = new Random();
                int max = Integer.parseInt(tv.getText().toString());
                int min = 0;
                int randomNum = rand.nextInt((max - min) + 1) + min;
                tv.setText(randomNum);
            }
        });
        findViewById(R.id.igual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.numero);
                tv.findViewById(R.id.numero).setBackgroundColor(Color.GREEN);
            }
        });

    }
}
