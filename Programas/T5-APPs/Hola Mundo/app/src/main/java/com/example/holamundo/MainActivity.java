package com.example.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Eventos

    public void onClick (View v)
    {
        TextView texto = findViewById(R.id.Texto);
        if(texto.getText().equals(""))
        {
            texto.setText("Hola Mundo");
        }
        else {
            texto.setText("");
        }
    }
}
