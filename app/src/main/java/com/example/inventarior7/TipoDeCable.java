/*Si el usuario elige la opción de "Cable" para dar de alta te envia a esta actividad en la que
* se elige que tipo de cable es el que se va a entrar o salir.
*
* Se presentan 3 opciones coaxial, utp y otro. Las dos primeras se usarán para grabar que tipo de
* cable es en la base de datos y posteriormente te salta a la actividad donde se captura la marca
* del cable (MarcaDeCable). La tercera opción manda al usuario a la actividad OtroCable en donde
* se le da la opción de capturar abiertamente que tipo de cable es.
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

public class TipoDeCable extends AppCompatActivity {
    //variables para vincular los radiobutton del layout activity_tipo_de_cable.xml y poder
    // interactuar con ellos
    private RadioButton radBtnCableCoaxial;
    private RadioButton radBtnCableUTP;
    private RadioButton radBtnOtro;

    //cadena que se utilizara para que el toast despliege que tipo de cable es
    //esta cadena se puede usar tambien para guardar el tipo de cable en la base de datos
    private String str;

    //variable para vincular el radioGroup del layout activity_tipo_de_cable.xml para hacerle clear
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_cable);

        //inicialización de las variables de radio button y radio group
        radBtnCableCoaxial = findViewById(R.id.radioButtonCableCoaxial);
        radBtnCableUTP = findViewById(R.id.radioButtonCableUTP);
        radBtnOtro = findViewById(R.id.radioButtonOtro);

        radioGroup = findViewById(R.id.radioGroup3);
    }

    //método vinculado al boton del layout activity_tipo_de_cable.xml por medio de onClick
    //cuando el usuaro seleciona el boton se ejecuta este codigo
    public void seleccionarTipoDeCable(View view){
        //intent para el salto a la actividad MarcaDeCable
        Intent marcaDeCable = new Intent(getApplicationContext(), MarcaDeCable.class);

        //si el usuario selecciona la opcion de "Coaxial" se ejecuta esta sección de código
        if (radBtnCableCoaxial.isChecked()){
            str = "Coaxial";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeCable);
        }

        //si el usuario selecciona la opcion de "UTP" se ejecuta esta sección de código
        else if (radBtnCableUTP.isChecked()){
            str = "UTP";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeCable);
        }

        //si el usuario selecciona la opcion de "Otro" se ejecuta esta sección de código
        else if (radBtnOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroCable = new Intent(getApplicationContext(), OtroCable.class);
            startActivity(otroCable);
        }


        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();
    }
}