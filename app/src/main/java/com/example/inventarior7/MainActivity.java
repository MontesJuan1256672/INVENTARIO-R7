package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioButton radButEnt;
    private RadioButton radButSal;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radButEnt =  findViewById(R.id.radioButtonEntrada);
        radButSal =  findViewById(R.id.radioButtonSalida);
        radioGroup = findViewById(R.id.radioGroup);
    }

    public void Seleccionar(View view){
        if(radButEnt.isChecked()) {
            //salto a actividad TipoDeMaterial
            Intent tipoMaterial = new Intent(getApplicationContext(), TipoDeMaterial.class);
            startActivity(tipoMaterial);

        }

        else if(radButSal.isChecked()) {
            //salto a actividad EsSalida
            Intent esSalida = new Intent(getApplicationContext(), EsSalida.class);
            startActivity(esSalida);
        }

        radioGroup.clearCheck();
    }
}
