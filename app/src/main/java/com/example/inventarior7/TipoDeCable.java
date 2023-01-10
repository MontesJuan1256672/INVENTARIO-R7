package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TipoDeCable extends AppCompatActivity {
    private RadioButton radBtnCableCoaxial;
    private RadioButton radBtnCableUTP;
    private RadioButton radBtnOtro;
    private String str;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_cable);

        radBtnCableCoaxial = findViewById(R.id.radioButtonCableCoaxial);
        radBtnCableUTP = findViewById(R.id.radioButtonCableUTP);
        radBtnOtro = findViewById(R.id.radioButtonOtro);

        radioGroup = findViewById(R.id.radioGroup3);
    }

    public void seleccionarTipoDeCable(View view){
        Intent marcaDeCable = new Intent(getApplicationContext(), MarcaDeCable.class);

        if (radBtnCableCoaxial.isChecked()){
            str = "Coaxial";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeCable);
        }

        else if (radBtnCableUTP.isChecked()){
            str = "UTP";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeCable);
        }

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