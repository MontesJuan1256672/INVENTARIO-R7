/*Si el usuario elige la opción de "Anclaje" para dar de alta te envia a esta actividad en la que
 * se elige que tipo de anclaje es el que se va a entrar o salir.
 *
 * Se presentan diferentes opciones. Las 4 primeras se usarán para grabar que tipo de
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

public class TipoDeAnclaje extends AppCompatActivity {
    private RadioButton radBtnAnclajeTorreOMastil;
    private RadioButton radBtnAnclajeAngulos;
    private RadioButton radBtnAnclajeTensorGancho3_8;
    private RadioButton getRadBtnAnclajeTensorGancho3_6;
    private RadioButton radBtnAnclajeBandola;
    private RadioButton radBtnAnclajeOtro;

    private String str;

    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_anclaje);

        radBtnAnclajeTorreOMastil = findViewById(R.id.radioButtonAnclajeTorreOMastil);
        radBtnAnclajeAngulos = findViewById(R.id.radioButtonAnclajeAngulos);
        radBtnAnclajeTensorGancho3_8 = findViewById(R.id.radioButtonAnclajeTensorOGancho);
        getRadBtnAnclajeTensorGancho3_6 = findViewById(R.id.radioButtonAnclajeTensorOGancho3_6);
        radBtnAnclajeBandola = findViewById(R.id.radioButton_anclaje_bandola);
        radBtnAnclajeOtro = findViewById(R.id.radioButton_anclaje_otro);

        radioGroup = findViewById(R.id.radioGroup14);
    }

    public void getTipoAnclaje(View view){
        Intent marcaDeAnclaje = new Intent(getApplicationContext(), MarcaDeAnclaje.class);

        if (radBtnAnclajeTorreOMastil.isChecked()){
            str = "Torre o mastil";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeAnclaje);
        }

        else if (radBtnAnclajeAngulos.isChecked()){
            str = "Angulos";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeAnclaje);
        }

        else if (radBtnAnclajeTensorGancho3_8.isChecked()){
            str = "Tensor gancho 3/8";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeAnclaje);
        }

        else if (getRadBtnAnclajeTensorGancho3_6.isChecked()){
            str = "Tensor gancho 3/6";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeAnclaje);
        }

        else if (radBtnAnclajeBandola.isChecked()){
            str = "Tensor gancho 3/6";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeAnclaje);
        }

        else if (radBtnAnclajeOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroAnclaje = new Intent(getApplicationContext(), OtroAnclaje.class);
            startActivity(otroAnclaje);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();
    }
}