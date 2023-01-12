/*Una vez que el usuario a seleccionado el tipo de herraje y dicha información se guardo
* correctamente en la base de datos se salta a esta actividad en donde se captura la marca del
* producto, (opciones pendientes)
*/

package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaDeHerraje extends AppCompatActivity {
    private RadioButton marcaHerraje1;
    private RadioButton marcaHerraje2;
    private String str;
    private String BD = "Base de Datos Actualizada";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_herraje);

        marcaHerraje1 = findViewById(R.id.radioButtonHerrajeMarca1);
        marcaHerraje2 = findViewById(R.id.radioButtonHerrajeMarca2);
    }

    public void getMarcaHerraje(View view){
        int secs = 2;

        if (marcaHerraje1.isChecked()){
            str = "marca de herraje 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaHerraje2.isChecked()){
            str = "marca de herraje 2";

            //TODO almacenar marca de cable en BD
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //despues de un delay de 2 segundos saltar a MainActivity
        Utils.delay(secs, new Utils.DelayCallBack() {
            @Override
            public void afterDelay() {
                //saltar a MainActivity
                Intent finHerraje = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(finHerraje);
            }
        });

        //mostar snackbar
        Snackbar entradaBD_send = Snackbar.make(view, BD, Snackbar.LENGTH_LONG);
        entradaBD_send.show();

    }
}