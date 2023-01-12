/*Si el usuario elige la opción de "Retenida" para dar de alta te envia a esta actividad en la que
 * se elige que tipo de retenida es el que se va a entrar o salir.
 *
 * Se presentan diferentes opciones. La 1 primera se usará para grabar que tipo de
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

public class TipoDeRetenida extends AppCompatActivity {
    private RadioButton radBtnRetenida316;
    private RadioButton radBtnREtenidaOtro;

    private RadioGroup radGrpRetenida;

    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_retenida);

        radBtnRetenida316 = findViewById(R.id.radioButtonRetenida3_16);
        radBtnREtenidaOtro = findViewById(R.id.radioButtonRetenida_otros);

        radGrpRetenida = findViewById(R.id.radioGroupRetenida);
    }


    public void seleccionarTipoDeRetenida(View view){

        if (radBtnRetenida316.isChecked()){
            str = "Retenida 3/16";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            Intent marcaDeRetenida = new Intent(getApplicationContext(), MarcaDeRetenida.class);
            startActivity(marcaDeRetenida);
        }

        if (radBtnREtenidaOtro.isChecked()){
            str = "Otro";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a OtraRetenida
            Intent otraRetenida = new Intent(getApplicationContext(), OtraRetenida.class);
            startActivity(otraRetenida);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radGrpRetenida.clearCheck();

    }
}