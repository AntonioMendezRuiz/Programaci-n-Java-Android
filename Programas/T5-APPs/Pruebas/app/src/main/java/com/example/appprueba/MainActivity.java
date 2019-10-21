package com.example.appprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.button);
        boton2 = findViewById(R.id.button2);
    }
    public void button1Click(View v)
    {
        boton2.setVisibility(View.VISIBLE);
        boton1.setVisibility(View.INVISIBLE);
    }

    public void button2Click(View v)
    {
        boton1.setVisibility(View.VISIBLE);
        boton2.setVisibility(View.INVISIBLE);
    }
}
