package com.example.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText et = findViewById(R.id.centi);
        final EditText et2 = findViewById(R.id.faren);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                double r, res;
                String si;
                r = Float.valueOf(et.getText().toString());
                res = (r*9/5) + 32;
                si = String.valueOf(res);
                et2.setText(si);
            }
        };



        final TextWatcher tw2 = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                double r, res;
                String si;
                r = Float.valueOf(et.getText().toString());
                res = (r - 32) * 5/9;
                si = String.valueOf(res);
                et.setText(si);
            }
        };




        et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    et.addTextChangedListener(tw);
                }
                else
                {
                    et.removeTextChangedListener(tw);
                }
            }
        });
        et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    et2.addTextChangedListener(tw2);
                }
                else
                {
                    et2.removeTextChangedListener(tw2);
                }
            }
        });



    }
}