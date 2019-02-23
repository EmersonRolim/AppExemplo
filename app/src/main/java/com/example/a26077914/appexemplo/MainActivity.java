package com.example.a26077914.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextInputEditText valor;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       valor = findViewById(R.id.inpValor);
       resultado = findViewById(R.id.txtResultado);
    }
    public void calcularValor(View v){
        double valorConta = Double.parseDouble(valor.getText().toString());
        double res = valorConta * 0.1;
        String texto = "O Valor da Conta é: R$" + res;
        resultado.setText(texto);
    }


}
