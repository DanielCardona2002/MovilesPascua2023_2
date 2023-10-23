package com.movilespascual.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView  gridView = findViewById(R.id.gridUno);
        gridView.setAdapter(new customAdapter(this));
        // determinar cantidad de columnas
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                Toast.makeText(MainActivity.this, "presionaste la imagen "+posicion, Toast.LENGTH_SHORT).show();
            }
        });



    }
}