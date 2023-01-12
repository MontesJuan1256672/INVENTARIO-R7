/*Si el usuario elige la opción de "Herraje" para dar de alta te envia a esta actividad en la que
 * se elige que tipo de herraje es el que se va a entrar o salir.
 *
 * Se presentan diferentes opciones. Las 2 primeras se usarán para grabar que tipo de
 * material es en la base de datos y posteriormente te salta a la actividad donde se captura la marca
 * del material. La tercera opción manda al usuario a la actividad  en donde
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

public class TipoDeHerraje extends AppCompatActivity {
    private RadioButton radBtnHerrajeOhmega;
    private RadioButton radBtnHerrajePerro;
    private RadioButton radBtnHerrajeOtro;

    private String str;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_herraje);

        radBtnHerrajeOhmega = findViewById(R.id.radioButtonHerrajeOhmegas);
        radBtnHerrajePerro = findViewById(R.id.radioButtonPerro);
        radBtnHerrajeOtro = findViewById(R.id.radioButtonOtroHerraje);

        radioGroup = findViewById(R.id.radioGroup10);
    }

    public void selectHerraje(View view){
        Intent marcaDeHerraje = new Intent(getApplicationContext(), MarcaDeHerraje.class);

        if (radBtnHerrajeOhmega.isChecked()){
            str = "Ohmega pared";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeHerraje);
        }

        else if (radBtnHerrajePerro.isChecked()){
            str = "Perro 3/16";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeHerraje);
        }

        else if (radBtnHerrajeOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroHerraje = new Intent(getApplicationContext(), OtroHerraje.class);
            startActivity(otroHerraje);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();
    }
}