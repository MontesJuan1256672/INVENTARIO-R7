/*Una vez que el usuario a seleccionado el tipo de router y dicha información se guardo correctamente
* en la base de datos se salta a esta actividad en donde se captura la marca del producto, (opciones
* pendientes)
*/

package com.example.inventarior7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MarcaDeRouter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca_de_router);
    }
}