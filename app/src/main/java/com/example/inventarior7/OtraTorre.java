/*Cuando el tipo de cable es diferente al de las opciones indicadas en la actividad TipoDeTorre en
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

public class OtraTorre extends AppCompatActivity {
    private EditText tipoDeTorre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra_torre);

        tipoDeTorre = findViewById(R.id.editText_otra_torre);
    }

    public void getTipoDeTorre(View view){
        String _tipoDeTorre = tipoDeTorre.getText().toString();
        Intent marcaDeTorre = new Intent(getApplicationContext(), MarcaDeTorre.class);

        Toast.makeText(getApplicationContext(),_tipoDeTorre,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeTorre);

        //clear a editText
        tipoDeTorre.getText().clear();
    }
}