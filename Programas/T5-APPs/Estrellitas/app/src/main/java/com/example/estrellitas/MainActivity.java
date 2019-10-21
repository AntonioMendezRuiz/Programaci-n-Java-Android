package com.example.estrellitas;

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
        EditText entrada = findViewById(R.id.numero);
        TextView salida = findViewById(R.id.salida);

        int pisos =Integer.valueOf(entrada.getText().toString());

        if(pisos < 3 || pisos % 2 == 0)
        {
            salida.setText("El número debe ser impar y mayor o igual que 3.");
        }
        else
        {
            String texto = pintaX(pisos);
            salida.setText(texto);
        }
    }

    private String repiteCaracter(char c, int veces)
    {
        String cadena = "";

        for(int i = 0; i < veces; i++)
        {
            cadena = cadena + c;
        }

        return cadena;
    }

    private String pintaX (int pisos)
    {
        String cadena = "";
        int star = pisos;
        int espacios = 0;

        while(star > 1)
        {
            cadena = cadena + repiteCaracter(' ', espacios);
            cadena = cadena + repiteCaracter('X', star) + "\n";
            star = star - 2;
            espacios = espacios + 1;
        }
        while(star <= pisos)
        {
            cadena = cadena + repiteCaracter(' ', espacios);
            cadena = cadena + repiteCaracter('X', star) + "\n";
            star = star + 2;
            espacios = espacios - 1;
        }

        return cadena;
    }
}
