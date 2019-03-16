package com.example.a26077914.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Ex03 extends AppCompatActivity {
    private TextInputEditText inputAltura;
    private RadioGroup rdGroup;
    private TextView txtResultado;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex03);
        inputAltura = findViewById(R.id.txtAltura);
        rdGroup = findViewById(R.id.rdSexo);
        txtResultado = findViewById(R.id.Resultado);
    }
    public void calcularPesoIdeal(View v){
        String altura = inputAltura.getText().toString();
        if(rdGroup.getCheckedRadioButtonId() ==R.id.Masculino){
            resultado = (72.7 * Double.parseDouble(altura)) - 58;

    }else{
            resultado = (62.1 * Double.parseDouble(altura)) - 44.7;
    }
        txtResultado.setText("O peso Ideal é " + resultado);

    }

}
