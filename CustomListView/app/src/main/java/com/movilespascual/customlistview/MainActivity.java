package com.movilespascual.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] idImagen = {
                R.drawable.pogba,
                R.drawable.messi,
                R.drawable.ney,
                R.drawable.nadal,
                R.drawable.lebron,
                R.drawable.madre,
        };

        String[] nombre = {
               "Paul Pogba",
               "Leonel Messi",
                "Neymar",
                "Nadal",
                "Lebron James",
                "Mamá"
        };

        String[] ultimoMensaje ={
                "Vamos hacer ejercicio", "Voy a ganar el balon de oro","Dani vamos a chirriar","Vamos a jugar tenis?","Dani me prestas dinero?","hijo bota la basuras por favor"
        };

        String[] horaUltimoMensaje ={
                "22:30", "09:14","23:15","15:40","10:45","09:20"
        };
        String[] numeroTelefono ={
                "+573452222", "+344333444","'358976410","+578765243","+349087652","+577121298"
        };

        String[] pais ={
                "Francia", "Argentina","Brasil","España","USA","Colombia"
        };




        ListAdapter listAdapter = new ListAdapter(MainActivity.this, nombre,ultimoMensaje,horaUltimoMensaje,numeroTelefono,pais,idImagen);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(listAdapter);
        //agregar listener para cuando se hace click sobre el item
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                //Agregar el intent
                Intent irAinformacion = new Intent(MainActivity.this,UserActivity.class)
                        .putExtra("nombre",nombre[posicion])
                        .putExtra("mensaje", ultimoMensaje[posicion])
                        .putExtra("hora",horaUltimoMensaje[posicion])
                        .putExtra("telefono",numeroTelefono[posicion])
                        .putExtra("pais",pais[posicion])
                        .putExtra("imagen",idImagen[posicion]);
                startActivity(irAinformacion);
            }
        });

    }
}