package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaTornilleria extends AppCompatActivity {
    private RadioButton marcaTornillo1;
    private RadioButton marcaTornillo2;
    private String str;
    private String BD = "Base de Datos Actualizada";
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcatornilleria);

        marcaTornillo1 = findViewById(R.id.radioButtonMarcaTornillo1);
        marcaTornillo2 = findViewById(R.id.radioButtonMarcaTornillo2);

        radioGroup = findViewById(R.id.radioGroup19);
    }

    public void getMarcaTornillo(View view){
        int secs = 2;

        if (marcaTornillo1.isChecked()){
            str = "marca de tornillo 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaTornillo2.isChecked()){
            str = "marca de tornillo 2";

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
                Intent finCable = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(finCable);
            }
        });

        //clear radio group
        radioGroup.clearCheck();
    }
}