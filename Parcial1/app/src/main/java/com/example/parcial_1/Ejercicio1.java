package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio1 extends AppCompatActivity {
EditText txtUsuario, txtContraseña;
Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);


        txtUsuario = findViewById(R.id.txtUsuario);
        txtContraseña = findViewById(R.id.txtpContraseña);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                IniciarSesion();
            }

            public void IniciarSesion(){

               String user, key;
               user = txtUsuario.getText().toString();
                key = txtContraseña.getText().toString();

                if (user.equals("parcialETps1") && key.equals("p4rC14l#tp$")){

                    Intent intentar= new Intent();
                    intentar = new Intent(Ejercicio1.this,Pantalla_Bienvenida.class);

                    startActivity(intentar);
                }
                else
                    Toast.makeText(Ejercicio1.this, "Contaseña y usuario no son correctos", Toast.LENGTH_SHORT).show();
            }


        });
    }
}