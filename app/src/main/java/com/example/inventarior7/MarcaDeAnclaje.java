/*Una vez que el usuario a seleccionado el tipo de anclaje y dicha información se guardo
* correctamente en la base de datos se salta a esta actividad en donde se captura la marca del
* producto, (opciones pendientes)
*/
package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaDeAnclaje extends AppCompatActivity {
    private RadioButton marcaAnclaje1;
    private RadioButton marcaAnclaje2;
    private String str;
    private String BD = "Base de Datos Actualizada";
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_anclaje);

        marcaAnclaje1 = findViewById(R.id.radioButtonMarcaAnclaje1);
        marcaAnclaje2 = findViewById(R.id.radioButtonMarcaAnclaje2);

        radioGroup = findViewById(R.id.radioGroup15);
    }

    public void getMarcaAnclaje(View view){
        int secs = 2;

        if (marcaAnclaje1.isChecked()){
            str = "marca de anclaje 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaAnclaje2.isChecked()){
            str = "marca de anclaje 2";

            //TODO almacenar marca de cable en BD
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //mostar snackbar
        Snackbar entradaBD_send = Snackbar.make(view, BD, Snackbar.LENGTH_LONG);
        entradaBD_send.show();

        //despues de un delay de 2 segundos saltar a MainActivity
        Utils.delay(secs, new Utils.DelayCallBack() {
            @Override
            public void afterDelay() {
                //saltar a MainActivity
                Intent finCable = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(finCable);
            }
        });

        //clear radio group
        radioGroup.clearCheck();
    }
}