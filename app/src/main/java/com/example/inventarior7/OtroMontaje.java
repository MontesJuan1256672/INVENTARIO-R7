package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OtroMontaje extends AppCompatActivity {
    private EditText tipoDeMontaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_montaje);

        tipoDeMontaje = findViewById(R.id.editTextTipoDeMontaje);
    }

    public void getTipoDeMontaje(View view){
        String _tipoDeMontaje = tipoDeMontaje.getText().toString();
        Intent marcaDeMontaje = new Intent(getApplicationContext(), MarcaDeMontaje.class);

        Toast.makeText(getApplicationContext(),_tipoDeMontaje,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeMontaje);

        //clear a editText
        tipoDeMontaje.getText().clear();
    }
}