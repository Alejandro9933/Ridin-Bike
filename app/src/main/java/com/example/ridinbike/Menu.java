package com.example.ridinbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void bug (View view){
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Alerta de bug");
        intent.putExtra(Intent.EXTRA_TEXT, "");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"chame.jms@gmail.com"});
        startActivity(intent);
    }

    public void estadisticas(View view) {
        Intent intent = new Intent(getApplicationContext(),Estadisticas.class);
        startActivity(intent);
    }

    public void  web(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ridingbike12.weebly.com/"));
        startActivity(intent);
    }

    public void  profile(View view){
        Intent intent = new Intent(getApplicationContext(),Editp.class);
        startActivity(intent);
    }
    public  void contact(View view){
        Intent intent = new Intent(getApplicationContext(),Contacts.class);
        startActivity(intent);
    }

}