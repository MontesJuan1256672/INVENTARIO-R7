/*Una vez que el usuario a seleccionado el tipo de cable y dicha información se guardo correctamente
* en la base de datos se salta a esta actividad en donde se captura la marca del producto, (opciones
* pendientes)
*/

package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaDeCable extends AppCompatActivity {
    private RadioButton marcaCable1;
    private RadioButton marcaCable2;
    private String str;
    private String BD = "Base de Datos Actualizada";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_cable);

        marcaCable1 = findViewById(R.id.radioButtonMarca1);
        marcaCable2 = findViewById(R.id.radioButtonMarca2);
    }

    public void getMarcaDeCable(View view){
        int secs = 2;

        if (marcaCable1.isChecked()){
            str = "marca de cable 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaCable2.isChecked()){
            str = "marca de cable 2";

            //TODO almacenar marca de cable en BD
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

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

    }
}
