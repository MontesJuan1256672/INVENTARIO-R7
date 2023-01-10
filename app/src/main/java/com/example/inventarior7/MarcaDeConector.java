package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MarcaDeConector extends AppCompatActivity {
    private RadioButton marcaConector1;
    private RadioButton marcaConector2;
    private String str;
    private String BD = "Base de Datos Actualizada";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_conector);

        marcaConector1 = findViewById(R.id.radioButtonMarcaConector_1);
        marcaConector2 = findViewById(R.id.radioButtonMarcaConector_2);
    }

    public void getMarcaConector(View view){
        int secs = 2;


        if (marcaConector1.isChecked()){
            str = "marca de conector 1";

            //TODO almacenar marca de cable en BD
        }

        if (marcaConector2.isChecked()){
            str = "marca de conector 2";

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