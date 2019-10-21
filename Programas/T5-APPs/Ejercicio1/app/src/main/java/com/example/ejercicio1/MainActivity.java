package com.example.ejercicio1;

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
        EditText centimetros = findViewById(R.id.numCentimetros);
        EditText pulgadas = findViewById(R.id.numPulgadas);

        double centi = Float.valueOf(centimetros.getText().toString());
        double pulga = Float.valueOf(pulgadas.getText().toString());


        if(v.getTag().equals("centimetros"))
        {
            pulgadas.setText(centimetrosApulgadas(centi));
        }
        else
        {
            centimetros.setText(pulgadasAcentimetros(pulga));
        }

    }

    public String centimetrosApulgadas( double centimetros)
    {
        double resultado;
        String valor;

        resultado = centimetros * 0.393701;

        valor = String.valueOf(resultado);

        return valor;
    }
    public String pulgadasAcentimetros(double pulgadas)
    {
        double resultado;
        String valor;

        resultado = pulgadas * 2.54;
        valor = String.valueOf(resultado);

        return valor;
    }

}
