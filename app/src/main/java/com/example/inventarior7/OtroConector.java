package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OtroConector extends AppCompatActivity {
    private EditText tipoDeConector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_conector);

        tipoDeConector = findViewById(R.id.editTextTipoDeConector);
    }

    public void tipoDeConector(View view){
        String _tipoDeConector = tipoDeConector.getText().toString();
        Intent marcaDeConector = new Intent(getApplicationContext(), MarcaDeConector.class);

        Toast.makeText(getApplicationContext(),_tipoDeConector,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeConector);

        //clear a editText
        tipoDeConector.getText().clear();
    }
}