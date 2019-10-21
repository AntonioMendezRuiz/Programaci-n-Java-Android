package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick (View v)
    {
        EditText primero = findViewById(R.id.primero);
        EditText segundo = findViewById(R.id.segundo);
        EditText resultado = findViewById(R.id.resultado);
        TextView simbolo = findViewById(R.id.operacion);

        double pri = Float.valueOf(primero.getText().toString());
        double seg = Float.valueOf(segundo.getText().toString());

        if(v.getTag().equals("+"))
        {
            resultado.setText(String.valueOf(pri + seg));
            simbolo.setText("+");

        }else if (v.getTag().equals("-"))
        {
            resultado.setText(String.valueOf(pri - seg));
            simbolo.setText("-");

        }else if (v.getTag().equals("*"))
        {
            resultado.setText(String.valueOf(pri * seg));
            simbolo.setText("*");
        }
        else
        {
            resultado.setText(String.valueOf(pri / seg));
            simbolo.setText("/");
        }



    }
}
