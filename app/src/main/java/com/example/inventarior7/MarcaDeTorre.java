package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaDeTorre extends AppCompatActivity {
    private RadioButton marcaTorre1;
    private RadioButton marcaTorre2;
    private String str;
    private String BD = "Base de Datos Actualizada";
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_torre);

        marcaTorre1 = findViewById(R.id.radioButton_torre_marca1);
        marcaTorre2 = findViewById(R.id.radioButton_torre_marca2);

        radioGroup = findViewById(R.id.radioGroup13);
    }

    public void getMarcaTorre(View view){
        int secs = 2;

        if (marcaTorre1.isChecked()){
            str = "marca de torre 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaTorre2.isChecked()){
            str = "marca de torre 2";

            //TODO almacenar marca de cable en BD
        }

        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();




        //mostar snackbar
        Snackbar entradaBD_send = Snackbar.make(view, BD, Snackbar.LENGTH_LONG);
        entradaBD_send.show();

        //despues de un delay de 2 segundos saltar a MainActivity
        Utils.delay(secs, new Utils.DelayCallBack() {
            @Override
            public void afterDelay() {
                //saltar a MainActivity
                Intent finTorre = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(finTorre);
            }
        });

        //clear radio group
        radioGroup.clearCheck();
    }
}