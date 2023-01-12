/*Cuando el tipo de cable es diferente al de las opciones indicadas en la actividad TipoDeHerraje en
* esta actividad se le da la opción al usuario para que capture el tipo de cable que es un un
* EditText
*/

package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OtroHerraje extends AppCompatActivity {
    private EditText tipoHerraje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_herraje);

        tipoHerraje = findViewById(R.id.editTextTipoHerraje);
    }

    public void getTipoHerraje(View view){
        String _tipoDeHerraje = tipoHerraje.getText().toString();
        Intent marcaDeCable = new Intent(getApplicationContext(), MarcaDeHerraje.class);

        Toast.makeText(getApplicationContext(),_tipoDeHerraje,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeCable);

        //clear a editText
        tipoHerraje.getText().clear();
    }
}