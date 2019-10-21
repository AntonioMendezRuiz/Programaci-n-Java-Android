package com.example.estadisticastexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText texto = findViewById(R.id.texto);

        final TextView tvLetras =findViewById(R.id.numletras);
        final TextView tvVocales =findViewById(R.id.numvocales);
        final TextView tvConsonantes =findViewById(R.id.numconsonantes);
        final TextView tvPalabras =findViewById(R.id.numpalabras);



        final TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String frase;
                frase = texto.getText().toString();
                int letras = 0, vocales = 0, consonantes = 0, palabras = 0, i;

                for(i = 0; i < s.length();i++)
                {
                    if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'|| frase.charAt(i) == 'u')
                    {
                        vocales++;
                    }
                    else if(!(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'|| frase.charAt(i) == 'u' || frase.charAt(i) == ' '))
                    {
                        consonantes++;
                    }
                    else if(frase.charAt(i) == ' ')
                    {
                        palabras++;
                    }
                }
                letras = consonantes + vocales;

                tvLetras.setText(letras);
                tvConsonantes.setText(consonantes);
                tvVocales.setText(vocales);
                tvPalabras.setText(palabras);
            }
        };



    }
}
