/*Si el usuario elige la opción de "Consumible" para dar de alta te envia a esta actividad en la que
 * se elige que tipo de consumible es el que se va a entrar o salir.
 *
 * Se presentan diferentes opciones. Las 5 primeras se usarán para grabar que tipo de
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

public class TipoDeConsumible extends AppCompatActivity {
    private RadioButton radBtnConsumibleCichos;
    private RadioButton radBtnConsumibleGrapas;
    private RadioButton radBtnConsumibleSilicon;
    private RadioButton radBtnConsumibleChupon;
    private RadioButton radBtnConsumibleReflejante;
    private RadioButton radBtnConsumibleOtro;

    private String str;

    private RadioGroup radioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_consumible);

        radBtnConsumibleCichos = findViewById(R.id.radioButtonCichos);
        radBtnConsumibleGrapas = findViewById(R.id.radioButtonGrapas);
        radBtnConsumibleSilicon = findViewById(R.id.radioButtonSilicon);
        radBtnConsumibleChupon = findViewById(R.id.radioButtonChupón);
        radBtnConsumibleReflejante = findViewById(R.id.radioButtonReflejante);
        radBtnConsumibleOtro = findViewById(R.id.radioButtonConsumible_otros);

        radioGroup = findViewById(R.id.radioGroup16);
    }

    public void getTipoConsumible(View view){
        Intent marcaDeConsumible = new Intent(getApplicationContext(), MarcaDeConsumible.class);

        if (radBtnConsumibleCichos.isChecked()){
            str = "Cichos";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeConsumible);
        }

        else if (radBtnConsumibleGrapas.isChecked()){
            str = "Grapas";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeConsumible);
        }

        else if (radBtnConsumibleSilicon.isChecked()){
            str = "Silicón";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeConsumible);
        }

        else if (radBtnConsumibleChupon.isChecked()){
            str = "Chupón";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeConsumible);
        }

        else if (radBtnConsumibleReflejante.isChecked()){
            str = "Reflejante";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeConsumible);
        }

        else if (radBtnConsumibleOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroConsumible = new Intent(getApplicationContext(), OtroConsumible.class);
            startActivity(otroConsumible);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();
    }
}
