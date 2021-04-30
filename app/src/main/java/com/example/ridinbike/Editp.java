package com.example.ridinbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Editp extends AppCompatActivity {
EditText txtname, txtexp, txtcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editp);

        txtname= findViewById(R.id.txtname);
        txtcountry= findViewById(R.id.txtcountry);
        txtexp= findViewById(R.id.txtexp);


    }
    public void  regresa(View view){

        String nombre = txtname.getText().toString();
        String pais = txtcountry.getText().toString();
        String expe = txtexp.getText().toString();

        Intent intent = new Intent(getApplicationContext(),Perfil.class);

        intent.putExtra("nombre",nombre);
        intent.putExtra("pais",pais);
        intent.putExtra("expe", expe);

        Toast.makeText(this,"Guardado",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}