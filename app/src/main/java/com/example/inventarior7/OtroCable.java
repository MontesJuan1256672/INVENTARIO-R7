/*Cuando el tipo de cable es diferente al de las opciones indicadas en la actividad TipoDeCable en
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

public class OtroCable extends AppCompatActivity {
    private EditText tipoDeCable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_cable);

        tipoDeCable = findViewById(R.id.editTextTipoDeCable);
    }

    public void getTipoDeCable(View view){
        String _tipoDeCable = tipoDeCable.getText().toString();
        Intent marcaDeCable = new Intent(getApplicationContext(), MarcaDeCable.class);

        Toast.makeText(getApplicationContext(),_tipoDeCable,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeCable);

        //clear a editText
        tipoDeCable.getText().clear();

    }
}