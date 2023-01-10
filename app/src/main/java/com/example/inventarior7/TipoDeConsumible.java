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
