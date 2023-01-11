package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TipoDeRouter extends AppCompatActivity {
    private RadioButton radBtnRouter_hAP;
    private RadioButton radBtnRouter_RB1100;
    private RadioButton radBtnRouter_RB2011;
    private RadioButton radBtnRouter_RB30AA;
    private RadioButton radBtnRouter_RB4011;
    private RadioButton radBtnRouter_hAP_ac;
    private RadioButton radBtnRouter_RB95;
    private RadioButton radBtnRouter_RB951G;
    private RadioButton radBtnRouter_RB5009;
    private RadioButton radBtnRouter_otro;

    private String str;

    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_router);

        radBtnRouter_hAP = findViewById(R.id.radioButtonRouter_hAP);
        radBtnRouter_RB1100 = findViewById(R.id.radioButtonRouter_RB1100);
        radBtnRouter_RB2011 = findViewById(R.id.radioButtonRouter_RB2011);
        radBtnRouter_RB30AA = findViewById(R.id.radioButtonRouter_30AA);
        radBtnRouter_RB4011 = findViewById(R.id.radioButtonRouter_4011);
        radBtnRouter_hAP_ac = findViewById(R.id.radioButtonRouter_hAP_ac);
        radBtnRouter_RB95 = findViewById(R.id.radioButtonRouter_RB95);
        radBtnRouter_RB951G = findViewById(R.id.radioButtonRouter_RB951G);
        radBtnRouter_RB5009 = findViewById(R.id.radioButtonRouter_RB5009);
        radBtnRouter_otro = findViewById(R.id.radioButtonRouter_otro);

        radioGroup = findViewById(R.id.radioGroup20);
    }

    public void getTipoDeRouter(View view){
        Intent marcaDeRouter = new Intent(getApplicationContext(), MarcaDeRouter.class);

        if (radBtnRouter_hAP.isChecked()){
            str = "hAP";

            //TODO almacenar coaxial como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_RB1100.isChecked()){
            str = "RB1100AHx4";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_RB2011.isChecked()){
            str = "RB2011UiAS";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_RB30AA.isChecked()){
            str = "RB30AAUiAS";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_RB4011.isChecked()){
            str = "RB4011iGS";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_hAP_ac.isChecked()){
            str = "hAP ac lite";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_RB95.isChecked()){
            str = "RB95Ui";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_RB951G.isChecked()){
            str = "RB951G";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_RB5009.isChecked()){
            str = "RB5009";

            //TODO almacenar UTP como tipo de cable en BD

            //saltar a MarcaDeCable
            startActivity(marcaDeRouter);
        }

        else if (radBtnRouter_otro.isChecked()){
            str = "Otro";
            //Salta a actividad OtroCable;
            Intent otroRouter = new Intent(getApplicationContext(), OtroRouter.class);
            startActivity(otroRouter);
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //clear radio group
        radioGroup.clearCheck();
    }
}