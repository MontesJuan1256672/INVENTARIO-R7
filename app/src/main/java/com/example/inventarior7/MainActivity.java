/*Primera actividad de la aplicación, aquí se le pide al usuario que
* determine si es entrada o salida de producto.
* En caso de ser entrada salta directamente a  la actividad TipoDeMaterial.class
*
* En caso de ser salida salta actividad EsSalida.class para solicitar el folio/Proyecto/
* para justificar el uso de material. Posteriormente salta a la actividad TipoDeMaterial.class
*
* Tanto si es entrada o salida debe de guardarse e indicarse  en la Base de Datos
* (la cual queda pendinte de desarrollar)
*
* Entrada o Salida serian las dos opciones de la primera columna de la tabla de BD
*
* El usuario solo puede elegir uno de las opciones
*
*/
package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    //declarar varaibles para radio button entrada y salida
    private RadioButton radButEnt;
    private RadioButton radButSal;

    //variable para el radio group se necesita para hacer clear a los radio button
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se vinculan las variables de radio button y radio group a los del layout activity_main.xml
        radButEnt =  findViewById(R.id.radioButtonEntrada);
        radButSal =  findViewById(R.id.radioButtonSalida);
        radioGroup = findViewById(R.id.radioGroup);
    }

    //método vinculado al boton del layout activity_main.xml por medio de onClick
    //cuando el usuario presiona dicho botón se ejecuta lo que está en este método
    public void Seleccionar(View view){

        //si el usuario selecciona el radio button de "Entrada" se ejectuta está sección de código
        if(radButEnt.isChecked()) {
            //se guarda en la Base de Datos que es entrada de producto
            //TODO guardar si es entrada en base de datos

            //salto a actividad TipoDeMaterial
            Intent tipoMaterial = new Intent(getApplicationContext(), TipoDeMaterial.class);
            startActivity(tipoMaterial);

        }

        //si el usuario selecciona el radio button de "Salida" se ejectuta está sección de código
        else if(radButSal.isChecked()) {
            //se guarda en la Base de Datos que es salida de producto
            //TODO guardar si es entrada en base de datos


            //salto a actividad EsSalida
            Intent esSalida = new Intent(getApplicationContext(), EsSalida.class);
            startActivity(esSalida);

        }

        //clear a los radio button entrada y/o salida
        radioGroup.clearCheck();
    }
}
