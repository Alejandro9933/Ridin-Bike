package com.example.ridinbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//VARIABLES DESDE LA CLASE
    Button registro_s, inicio_s;
    EditText logmail, logpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INICIAR LOS IDs DEL TEXTVIEW
        logmail = findViewById(R.id.logmail);
        logpass= findViewById(R.id.logpass);

        //INICIAR LOS IDs DE LOS BOTONES
        inicio_s = (Button) findViewById(R.id.inicio_s);

        inicio_s.setOnClickListener(new View.OnClickListener() {
            @Override

            //COMPROBACION DEL USUARIO Y CONTRASEÑA
            public void onClick(View v) {
                 String correo=logmail.getText().toString();
                 String contraseña=logpass.getText().toString();
;
                if (correo.equals("rodualex") && contraseña.equals("1234")) {
                    Intent intent  = new Intent(getApplicationContext(),mapa.class);
                    logmail.setText("");
                    logpass.setText("");
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Verifica los datos", Toast.LENGTH_LONG).show();
                }

            }
        });

        //ID DEL BOTON REGISTRO
        registro_s = (Button)findViewById(R.id.registro_s);
        registro_s.setOnClickListener(new View.OnClickListener() {
            @Override
            //ENVIO A LA PAGINA DE REGISTRO
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),Mainregistro.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

}