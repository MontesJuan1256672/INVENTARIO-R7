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