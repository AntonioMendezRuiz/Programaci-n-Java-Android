package com.example.ejemploentradatexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.boton);
    }

    public void buttonClick (View v)
    {
        EditText entradaTexto = findViewById(R.id.usuario);
        TextView salidaTexto = findViewById(R.id.salida);

        //String texto = entradaTexto.getText().toString();
        // texto = texto.toUpperCase();
        //salidaTexto.setText(texto);

        String texto = entradaTexto.getText().toString();
        String[] palabras = texto.split(" ");

        String salida = "";
        for(int i = 0; i < palabras.length; i++)
        {
            salida = salida + palabras[i] + "\n";
        }

        salidaTexto.setText(salida);
    }
}
