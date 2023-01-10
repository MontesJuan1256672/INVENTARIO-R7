package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EsSalida extends AppCompatActivity {
    private EditText folio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_salida);

        folio = findViewById(R.id.folio);
    }


    public void recuperarFolio(View view){
        String _folio = folio.getText().toString();

        Toast.makeText(getApplicationContext(),_folio,Toast.LENGTH_SHORT).show();

        //TODO guardar _folio en Base de Datos


        //TODO saltar a actividad TipoDeActividad
        Intent tipoMaterial = new Intent(getApplicationContext(), TipoDeMaterial.class);
        startActivity(tipoMaterial);

        //Clear a EditText
        folio.getText().clear();
    }




}