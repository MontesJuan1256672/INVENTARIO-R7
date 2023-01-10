package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaDeMontaje extends AppCompatActivity {
    private RadioButton marcaMontaje1;
    private RadioButton marcaMontaje2;
    private String str;
    private String BD = "Base de Datos Actualizada";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_montaje);

        marcaMontaje1 = findViewById(R.id.radioButtonMarcaMontaje1);
        marcaMontaje2 = findViewById(R.id.radioButtonMarcaMontaje2);
    }

    public void getMarcaMontaje(View view){
        int secs = 2;

        if (marcaMontaje1.isChecked()){
            str = "marca de montaje 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaMontaje2.isChecked()){
            str = "marca de montaje 2";

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

    }
}