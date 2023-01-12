/*Si el usuario elige la opción de "Conector" para dar de alta te envia a esta actividad en la que
 * se elige que tipo de conector es el que se va a entrar o salir.
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

public class TipoDeConector extends AppCompatActivity {
    private RadioButton radBtnConectorCoaxial;
    private RadioButton radBtnConectorUTP;
    private RadioButton radBtnConectorOtro;

    private String str;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_conector);

        radBtnConectorCoaxial = findViewById(R.id.radioButton);
        radBtnConectorUTP = findViewById(R.id.radioButton2);
        radBtnConectorOtro = findViewById(R.id.radioButton3);

        radioGroup = findViewById(R.id.radioGroup4);
    }

    public void seleccionarTipoConector(View view){
        Intent marcaDeConector = new Intent(getApplicationContext(), MarcaDeConector.class);

        if (radBtnConectorCoaxial.isChecked()){
            str = "Coaxial";

            //TODO almacenar coaxial como tipo de conector en BD

            //saltar a MarcaDeConector
            startActivity(marcaDeConector);
        }

        else if (radBtnConectorUTP.isChecked()){
            str = "UTP";

            //TODO almacenar UTP como tipo de conector en BD

            //saltar a MarcaDeConector
            startActivity(marcaDeConector);
        }

        else if (radBtnConectorOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroConector = new Intent(getApplicationContext(), OtroConector.class);
            startActivity(otroConector);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();
    }
}