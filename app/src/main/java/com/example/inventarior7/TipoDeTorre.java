package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TipoDeTorre extends AppCompatActivity {
    private RadioButton radBtnTorreTramo;
    private RadioButton radBtnTorreCopete;
    private RadioButton radBtnTorreBase;
    private RadioButton radBtnTorreOtro;

    private String str;

    private RadioGroup radioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_torre);

        radBtnTorreTramo = findViewById(R.id.radioButtonTramoTorre);
        radBtnTorreCopete = findViewById(R.id.radioButtonTorre_copete);
        radBtnTorreBase = findViewById(R.id.radioButtonTorre_base_torre);
        radBtnTorreOtro = findViewById(R.id.radioButtonTorre_otro);

        radioGroup = findViewById(R.id.radioGroup12);
    }

    public void seleccionarTipoTorre(View view){
        Intent marcaDeTorre = new Intent(getApplicationContext(), MarcaDeTorre.class);

        if (radBtnTorreTramo.isChecked()){
            str = "Tramo torre";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeTorre);
        }

        else if (radBtnTorreCopete.isChecked()){
            str = "Copete";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeTorre);
        }

        else if (radBtnTorreBase.isChecked()){
            str = "Base";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeTorre);

        }

        else if (radBtnTorreOtro.isChecked()){
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