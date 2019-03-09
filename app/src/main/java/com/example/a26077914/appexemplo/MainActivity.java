package com.example.a26077914.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextInputEditText valor;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       valor = findViewById(R.id.inpValor);
       resultado = findViewById(R.id.Resultado);
    }
    public void calcularValor(View v){
        double valorConta = Double.parseDouble(valor.getText().toString());
        double res = valorConta * 0.1;
        String texto = "O Valor da Conta é: R$" + res;
        resultado.setText(texto);
    }


}
