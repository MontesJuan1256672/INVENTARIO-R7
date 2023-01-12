/*Cuando el tipo de cable es diferente al de las opciones indicadas en la actividad TipoDeAnclaje en
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

public class OtroAnclaje extends AppCompatActivity {
    private EditText tipoDeAnclaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_anclaje);

        tipoDeAnclaje = findViewById(R.id.editText_otra_anclaje);
    }

    public void getOtroAnclaje(View view){
        String _tipoDeCable = tipoDeAnclaje.getText().toString();
        Intent marcaDeAnclaje = new Intent(getApplicationContext(), MarcaDeAnclaje.class);

        Toast.makeText(getApplicationContext(),_tipoDeCable, Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeAnclaje);

        //clear a editText
        tipoDeAnclaje.getText().clear();
    }
}