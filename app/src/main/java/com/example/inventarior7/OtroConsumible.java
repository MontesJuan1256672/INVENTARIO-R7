/*Cuando el tipo de cable es diferente al de las opciones indicadas en la actividad TipoDeConsumible
* en esta actividad se le da la opción al usuario para que capture el tipo de cable que es un un
* EditText
*/

package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OtroConsumible extends AppCompatActivity {
    private EditText tipoDeConsumible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_consumible);

        tipoDeConsumible = findViewById(R.id.editTexTipoDeConsumible);
    }

    public void getOtroConsumible(View view){
        String _tipoDeConsumible = tipoDeConsumible.getText().toString();
        Intent marcaDeConsumible = new Intent(getApplicationContext(), MarcaDeConsumible.class);

        Toast.makeText(getApplicationContext(),_tipoDeConsumible,Toast.LENGTH_SHORT).show();

        //TODO guardar _tipoDeCable en BD

        //saltar a actividad MarcaDeCable
        startActivity(marcaDeConsumible);

        //clear a editText
        tipoDeConsumible.getText().clear();
    }
}