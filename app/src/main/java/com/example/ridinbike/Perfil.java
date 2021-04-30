package com.example.ridinbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Perfil extends AppCompatActivity {
TextView lblname, lblexp,lblcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        lblname=findViewById(R.id.lblname);
        lblexp= findViewById(R.id.lblexp);
        lblcountry= findViewById(R.id.lblcountry);
        Bundle datos = getIntent().getExtras();

        lblname.setText(datos.getString("nombre"));
        lblexp.setText(datos.getString("expe"));
        lblcountry.setText(datos.getString("pais"));
    }
    public void  edit(View view) {
        Intent intent = new Intent(getApplicationContext(), Editp.class);
        startActivity(intent);

    }
}