package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TipoDeTornilleria extends AppCompatActivity {
    private RadioButton radBtnTornilloMadera;
    private RadioButton radBtnTornilloLamina;
    private RadioButton radBtnTornilloConcreto;
    private RadioButton radBtnTornilloExpansivo;
    private RadioButton radBtnTornilloOtro;
    private RadioGroup radioGroup;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_tornilleria);

        radBtnTornilloMadera = findViewById(R.id.radioButtonTornilloMadera);
        radBtnTornilloLamina = findViewById(R.id.radioButtonTornilloLamina);
        radBtnTornilloConcreto = findViewById(R.id.radioButtonTornilloConcreto);
        radBtnTornilloExpansivo = findViewById(R.id.radioButtonTornilloExpansivo);
        radBtnTornilloOtro = findViewById(R.id.radioButtonTornilloOtro);

        radioGroup = findViewById(R.id.radioGroup18);
    }

    public void getTipoDeTornillo (View view){
        Intent marcaTornilleria = new Intent(getApplicationContext(), MarcaTornilleria.class);

        if (radBtnTornilloMadera.isChecked()){
            str = "Madera";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaTornilleria);
        }

        else if (radBtnTornilloLamina.isChecked()){
            str = "Lamina";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaTornilleria);
        }

        else if (radBtnTornilloConcreto.isChecked()){
            str = "Concreto";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaTornilleria);
        }

        else if (radBtnTornilloExpansivo.isChecked()){
            str = "Expansivo";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaTornilleria);
        }

        else if (radBtnTornilloOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroTornilleria = new Intent(getApplicationContext(), OtroTornilleria.class);
            startActivity(otroTornilleria);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();
    }
}