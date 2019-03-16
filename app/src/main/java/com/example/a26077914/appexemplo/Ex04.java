package com.example.a26077914.appexemplo;

import android.graphics.Color;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Ex04 extends AppCompatActivity {
    private TextInputEditText minutos;
    private Spinner operadoras;
    private TextView resultado;
    private String itemEscolhido;
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex04);
        minutos = findViewById(R.id.txtMinutos);
        operadoras = findViewById(R.id.spinner);
        resultado = findViewById(R.id.txtResultado);


        operadoras.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                itemEscolhido = operadoras.getSelectedItem().toString();
                String tempo = minutos.getText().toString();


                if (itemEscolhido.equals("OP1")) {

                    res = (Double.parseDouble(tempo) * 0.020);
                    resultado.setText("Valor é: R$" + res);
                } else {
                    if (itemEscolhido.equals("OP2")) {

                        res = (Double.parseDouble(tempo) * 0.025);
                        resultado.setText("Valor é: R$" + res);
                    } else {
                        if (itemEscolhido.equals("OP3")) {
                            res = (Double.parseDouble(tempo) * 0.019);
                            resultado.setText("Valor é: R$" + res);
                        } else {
                            if (itemEscolhido.equals("")) {

                                resultado.setText("Escolha uma Operadora!");

                            }
                        }
                    }
                }

        }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
