package com.example.indicecorporal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button buttonCalcular;
EditText PlainTextAdiocionar;
EditText PlainTextAdiocionar2;
TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        PlainTextAdiocionar = findViewById(R.id.PlainTextAdicionar);
        PlainTextAdiocionar2 = findViewById(R.id.PlainTextAdicionar2);
        Resultado = findViewById(R.id.Resultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Double.parseDouble(PlainTextAdiocionar.getText().toString());
                double valor2 = Double.parseDouble(PlainTextAdiocionar2.getText().toString());
                double resultado = (valor1 * valor1) / valor2;
                Resultado.setText(String.valueOf(resultado));

            }
        });
    }

}