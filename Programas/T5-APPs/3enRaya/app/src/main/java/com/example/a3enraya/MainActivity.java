package com.example.a3enraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.cert.Certificate;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int[] CELDAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CELDAS=new int[9];

        CELDAS[0]=R.id.button1;
        CELDAS[1]=R.id.button2;
        CELDAS[2]=R.id.button3;
        CELDAS[3]=R.id.button4;
        CELDAS[4]=R.id.button5;
        CELDAS[5]=R.id.button6;
        CELDAS[6]=R.id.button7;
        CELDAS[7]=R.id.button8;
        CELDAS[8]=R.id.button9;

        ganar(CELDAS);
    }

    public void onClick (View v) {
        Button b = (Button)v;
        int celda = 0, aleatorio;
        Button c = new Button(this);
        if(b.isClickable())
        {
            b.setText("X");
            b.getId();

            for(int i = 0; i < 9; i++)
            {
               if (b.getId() == CELDAS[i])
               {
                   celda = i;
               }
            }
        }

        Random r = new Random();
        aleatorio = r.nextInt(8);
        c.setId(CELDAS[aleatorio]);

        while(aleatorio == celda)
        {
            if(aleatorio != celda)
            {
                c.setText("O");
            }
            aleatorio = r.nextInt(8);
        }

    }


    public void reiniciar (View v)
    {
        Button b = (Button)v;
        for(int i = 0; i < 9; i++)
        {
             b = findViewById(CELDAS[i]);
             b.setText("");
        }
    }

    public void ganar(int[] celdas)
    {
        if(findViewById(celdas[0]).toString().equals("X") && findViewById(celdas[1]).toString().equals("X") && findViewById(celdas[2]).toString().equals("X"))
        {
            TextView et = findViewById(R.id.resultado);
            et.setText("Has ganado");
        }
    }
}
