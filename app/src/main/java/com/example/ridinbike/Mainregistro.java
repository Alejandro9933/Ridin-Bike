package com.example.ridinbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mainregistro extends AppCompatActivity {



Button crear_s;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainregistro);

    }


    public void reg(View view){
        Intent intent3  = new Intent(getApplicationContext(),MainActivity.class);
        Toast.makeText(getApplicationContext(),"Gracias por registrarte", Toast.LENGTH_LONG).show();
        startActivity(intent3);
    }
}