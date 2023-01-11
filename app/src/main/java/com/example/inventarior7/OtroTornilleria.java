package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OtroTornilleria extends AppCompatActivity {
    private EditText tipoDeTornillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_tornilleria);

        tipoDeTornillo = findViewById(R.id.editText_otro_tornillo);
    }

    public void getTipoDeTornillo(View view){
        String _tipoDeTornillo = tipoDeTornillo.getText().toString();
        Intent marcaDeTornillo = new Intent(getApplicationContext(), MarcaTornilleria.class);

        Toast.makeText(getApplicationContext(),_tipoDeTornillo,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeTornillo);

        //clear a editText
        tipoDeTornillo.getText().clear();
    }
}