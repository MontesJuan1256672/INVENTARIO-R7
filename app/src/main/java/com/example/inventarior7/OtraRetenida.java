package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OtraRetenida extends AppCompatActivity {
    private EditText tipoDeRetenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra_retenida);

        tipoDeRetenida = findViewById(R.id.editTextTipoDeRetenida);
    }

    public void getTipoRetenida(View view){
        String _tipoDeRetenida = tipoDeRetenida.getText().toString();
        Intent marcaDeRetenida = new Intent(getApplicationContext(), MarcaDeRetenida.class);


        Toast.makeText(getApplicationContext(),_tipoDeRetenida,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeRetenida);

        //clear a editText
        tipoDeRetenida.getText().clear();
    }
}