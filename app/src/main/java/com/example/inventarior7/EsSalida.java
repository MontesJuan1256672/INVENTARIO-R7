/*Si en la actividad anterior se escogio salida de producto esta es la segunda opción del usuario.
* Aquí se le pide al usuario que ingrese el número de folio, nombre de la tarea o proyecto,
* para justificar la salida de material */

package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EsSalida extends AppCompatActivity {
    //variable que sera utilizada para vincular con el EditText del layout activity_es_salida.xml,
    //recuperar lo que el usuario escribió en el renglón y guardarlo en un string
    private EditText folio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_salida);

        //se inicializa la variable y se vincula con el edit text del layout activity_es_salida.xml
        folio = findViewById(R.id.folio);
    }

    //método vinculado al boton del layout activity_es_salida.xml por medio de onClick
    //cuando el usuario presiona dicho botón se ejecuta lo que está en este método
    public void recuperarFolio(View view){

        //variable que recupera y almacena lo que el usuario escribió en el EditText del layout
        //activity_es_salida.xml
        String _folio = folio.getText().toString();

        //muestra en pantalla una pequeña leyenda con lo que el usuario capturo en el EditText del
        //layout activity_es_salida.xml
        Toast.makeText(getApplicationContext(),_folio,Toast.LENGTH_SHORT).show();

        //se guarda el folio/nombre de proyecto/nombre de tarea asiganda en una columna del
        //la base de datos (pendiente desarrollar)
        //TODO guardar _folio en Base de Datos

        //saltar a actividad TipoDeActividad
        Intent tipoMaterial = new Intent(getApplicationContext(), TipoDeMaterial.class);
        startActivity(tipoMaterial);

        //Clear a EditText
        folio.getText().clear();
    }




}