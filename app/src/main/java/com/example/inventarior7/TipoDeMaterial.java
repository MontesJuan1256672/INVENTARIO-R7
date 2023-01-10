package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TipoDeMaterial extends AppCompatActivity {
    private RadioButton radBtnCable;
    private RadioButton radBtnConectores;
    private RadioButton radBtnRetenida;
    private RadioButton radBtnMontaje;
    private RadioButton radBtnHerraje;
    private RadioButton radBtnTorre;
    private RadioButton radBtnAnclaje;
    private RadioButton radBtnConsumibles;
    private RadioButton radBtnTornilleria;
    private RadioButton radBtnRouter;
    private RadioButton radBtnRadio;
    private RadioButton radBtnOtros;

    private String str;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_material);

        radBtnCable = findViewById(R.id.radioButtonCable);
        radBtnConectores = findViewById(R.id.radioButtonConectores);
        radBtnRetenida = findViewById(R.id.radioButtonRetenida);
        radBtnMontaje = findViewById(R.id.radioButtonMontaje);
        radBtnHerraje = findViewById(R.id.radioButtonHerraje);
        radBtnTorre = findViewById(R.id.radioButtonTorre);
        radBtnAnclaje = findViewById(R.id.radioButtonAnclaje);
        radBtnConsumibles = findViewById(R.id.radioButtonConsumibles);
        radBtnTornilleria = findViewById(R.id.radioButtonTorenilleria);
        radBtnRouter = findViewById(R.id.radioButtonRouter);
        radBtnRadio = findViewById(R.id.radioButtonRadio);
        radBtnOtros = findViewById(R.id.radioButtonOtro);

        radioGroup = findViewById(R.id.radioGroup2);

    }

    public void SeleccionarMaterial(View view){

        if(radBtnCable.isChecked()) {
            str = "Cable";

            //TODO guardar dato en BD


            //salto a actividad TipoDeCable
            Intent tipoDeCable = new Intent(getApplicationContext(), TipoDeCable.class);
            startActivity(tipoDeCable);
        }

        else if(radBtnConectores.isChecked()) {
            str = "Conectores";

            //TODO guardar dato en BD


            //salto a actividad TipoDeConector
            Intent tipoDeConector = new Intent(getApplicationContext(), TipoDeConector.class);
            startActivity(tipoDeConector);
        }

        else if(radBtnRetenida.isChecked()) {
            str = "Retenida";

            //TODO guardar dato en BD


            //salto a actividad TipoDeRetenida
            Intent tipoDeRetenida = new Intent(getApplicationContext(), TipoDeRetenida.class);
            startActivity(tipoDeRetenida);


        }

        else if(radBtnMontaje.isChecked()) {
            str = "Montaje";

            //TODO guardar dato en BD


            //salto a actividad TipoDeMontaje
            Intent tipoDeMontaje = new Intent(getApplicationContext(), TipoDeMontaje.class);
            startActivity(tipoDeMontaje);

        }

        else if(radBtnHerraje.isChecked()) {
            str = "Herraje";

            //TODO guardar dato en BD


            //TODO salto a actividad TipoDeHerraje
            Intent tipoDeHerraje = new Intent(getApplicationContext(), TipoDeHerraje.class);
            startActivity(tipoDeHerraje);
        }

        else if(radBtnTorre.isChecked()) {
            str = "Torre";

            //TODO guardar dato en BD


            //salto a actividad TipoDeTorre
            Intent tipoDeTorre = new Intent(getApplicationContext(), TipoDeTorre.class);
            startActivity(tipoDeTorre);
        }

        else if(radBtnAnclaje.isChecked()) {
            str = "Anclaje";

            //TODO guardar dato en BD


            //salto a actividad TipoDeAnclaje
            //salto a actividad TipoDeAnclaje
            Intent tipoDeAnclaje = new Intent(getApplicationContext(), TipoDeAnclaje.class);
            startActivity(tipoDeAnclaje);
        }

        else if(radBtnConsumibles.isChecked()) {
            str = "Consumibles";

            //TODO guardar dato en BD


            //salto a actividad TipoDeConsumibles
            Intent tipoDeConsumigle = new Intent(getApplicationContext(), TipoDeConsumible.class);
            startActivity(tipoDeConsumigle);
        }

        else if(radBtnTornilleria.isChecked()) {
            str = "Tornilleria";

            //TODO guardar dato en BD



            //TODO salto a actividad TipoDeTornilleria
        }

        else if(radBtnRouter.isChecked()) {
            str = "Router";

            //TODO guardar dato en BD



            //TODO salto a actividad TipoDeRouter
        }

        else if(radBtnRadio.isChecked()) {
            str = "Radio";

            //TODO guardar dato en BD



            //TODO salto a actividad TipoDeRadio
        }

        else if(radBtnOtros.isChecked()) {
            str = "Otros";


            //TODO guardar dato en BD


            //TODO salto a actividad TipoDeOtros
        }




        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();



    }
}
