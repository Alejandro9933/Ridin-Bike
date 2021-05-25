package com.example.ridinbike;

import androidx.appcompat.app.AppCompatActivity;

import android.database.MatrixCursor;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;
import android.app.ListActivity;
import android.view.View;
import android.widget.ListView;
import android.content.Intent;
import android.database.MatrixCursor;

public class Perfil extends ListActivity {
    Bundle datos;
MatrixCursor modelo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        datos= getIntent().getExtras();
        String cabeceras [] = new String[]{"_id", "img", "nombre", "pais", "exp"};

        modelo= new MatrixCursor(cabeceras);

        modelo.addRow(new Object[]{"0", R.drawable.shrek,datos.getString("nombre"),"País: "+ datos.getString("pais"),"Experiencia: "+ datos.getString("expe")});

        String colDatos[] = new String[]{"img", "nombre", "pais", "exp"};

        int[]  vistas = new int[]{R.id.imvFoto, R.id.Nombre, R.id.Pais, R.id.Exp};


        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.activity_perfil, modelo, colDatos,vistas,1);
        setListAdapter(adapter);
    }
}
