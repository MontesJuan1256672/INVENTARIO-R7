/*Si el usuario elige la opción de "Montaje" para dar de alta te envia a esta actividad en la que
 * se elige que tipo de montaje es el que se va a entrar o salir.
 *
 * Se presentan diferentes opciones. Las 2 primeras se usarán para grabar que tipo de
 * material es en la base de datos y posteriormente te salta a la actividad donde se captura la marca
 * del material. La ultima opción manda al usuario a la actividad  en donde
 * se le da la opción de capturar abiertamente que tipo de material es.
 *
 * Al final se le hace clear a el radioGroup para que así el usuario pueda capturar nueva información
 */

package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TipoDeMontaje extends AppCompatActivity {
    private RadioButton radBtnMontajeMastil;
    private RadioButton radBtnMontajeBrazo;
    private RadioButton radBtnMontajeOtro;
    private String str;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_montaje);

        radBtnMontajeMastil = findViewById(R.id.radioButtonMontajeMastil);
        radBtnMontajeBrazo = findViewById(R.id.radioButtonMontajeBrazo);
        radBtnMontajeOtro = findViewById(R.id.radioButtonMontajeOtro);

        radioGroup = findViewById(R.id.radioGroup8);
    }

    public void seleccionarTipoMontaje(View view){
        Intent marcaDeMontaje = new Intent(getApplicationContext(), MarcaDeMontaje.class);

        if (radBtnMontajeMastil.isChecked()){
            str = "Mastil";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeMontaje);
        }

        else if (radBtnMontajeBrazo.isChecked()){
            str = "Brazo";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeMontaje);
        }

        else if (radBtnMontajeOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroMontaje = new Intent(getApplicationContext(), OtroMontaje.class);
            startActivity(otroMontaje);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();

    }
}