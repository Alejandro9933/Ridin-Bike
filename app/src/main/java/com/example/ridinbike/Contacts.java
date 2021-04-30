package com.example.ridinbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }
public void savecont (View view){
    Intent intent = new Intent(getApplicationContext(),Menu.class);
    Toast.makeText(getApplicationContext(),"Guardado",Toast.LENGTH_LONG).show();
    startActivity(intent);
}
}