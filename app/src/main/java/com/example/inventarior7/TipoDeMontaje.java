package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TipoDeMontaje extends AppCompatActivity {
    private RadioButton radBtnMontajeMastil;
    private RadioButton radBtnMontajeBrazo;
    private RadioButton radBtnMontajeOtro;
    private String str;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_montaje);

        radBtnMontajeMastil = findViewById(R.id.radioButtonMontajeMastil);
        radBtnMontajeBrazo = findViewById(R.id.radioButtonMontajeBrazo);
        radBtnMontajeOtro = findViewById(R.id.radioButtonMontajeOtro);

        radioGroup = findViewById(R.id.radioGroup8);
    }

    public void seleccionarTipoMontaje(View view){
        Intent marcaDeMontaje = new Intent(getApplicationContext(), MarcaDeMontaje.class);

        if (radBtnMontajeMastil.isChecked()){
            str = "Mastil";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeMontaje);
        }

        else if (radBtnMontajeBrazo.isChecked()){
            str = "Brazo";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeMontaje);
        }

        else if (radBtnMontajeOtro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroMontaje = new Intent(getApplicationContext(), OtroMontaje.class);
            startActivity(otroMontaje);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();

    }
}