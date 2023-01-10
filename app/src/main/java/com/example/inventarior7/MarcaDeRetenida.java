package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaDeRetenida extends AppCompatActivity {
    private RadioButton marcaRetenida1;
    private RadioButton marcaRetenida2;
    private RadioButton marcaRetenida3;
    private String str;
    private String BD = "Base de Datos Actualizada";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_retenida);

        marcaRetenida1 = findViewById(R.id.radioButtonMarcaRetenida1);
        marcaRetenida2 = findViewById(R.id.radioButtonMarcaRetenida2);
        marcaRetenida3 = findViewById(R.id.radioButtonMarcaRetenida3);
    }


    public void getMarcaRetenida(View view){
        int secs = 2;


        if (marcaRetenida1.isChecked()){
            str = "marca de retenida 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaRetenida2.isChecked()){
            str = "marca de retenida 2";

            //TODO almacenar marca de cable en BD
        }

        if (marcaRetenida3.isChecked()){
            str = "marca de retenida 3";

            //TODO almacenar marca de cable en BD
        }


        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

        //delay de 2 seg para mostrar el snackbar
        Utils.delay(secs, new Utils.DelayCallBack(){
            @Override
            public void afterDelay(){
                //mostar snackbar
                Snackbar entradaBD_send = Snackbar.make(view, BD, Snackbar.LENGTH_LONG);
                entradaBD_send.show();
            }
        });


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