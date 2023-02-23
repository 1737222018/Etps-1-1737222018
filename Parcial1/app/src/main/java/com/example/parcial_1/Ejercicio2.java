package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio2 extends AppCompatActivity {
EditText EPeso, EAltura;
Button btncalculo;
TextView Mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        EPeso = findViewById(R.id.edtPeso);
        EAltura = findViewById(R.id.edtAltura);
        btncalculo = findViewById(R.id.btnCalcularIMC);
        Mensaje = findViewById(R.id.txvMensaje);

        btncalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculos();
            }


       public void calculos(){

            try{
                Double Cpeso, CAltura, IMC;
                String mensaje;
                Cpeso = Double.parseDouble(EPeso.getText().toString());
                CAltura = Double.parseDouble(EAltura.getText().toString());
                mensaje = "";
                IMC= Cpeso/(CAltura*CAltura);

                if (IMC<10.5)
                {
                    mensaje = "Criticamente bajo de peso";
                }
                else if (IMC>=10.5 && IMC<15.9)
                {
                    mensaje = "Severamente bajo de peso";
                }
                else if (IMC>=10.9 && IMC<18.5)
                {
                    mensaje = "Bajo de peso";
                }
                else if (IMC>=18.5 && IMC<25)
                {
                    mensaje = "Normal";
                }
                else if (IMC>=25 && IMC<30)
                {
                    mensaje = "SobrePeso";
                }
                else if (IMC>=30 && IMC<35)
                {
                    mensaje = "Obesidad Clase 1 - Moderadamente Obeso";
                }
                else if (IMC>=35 && IMC<40)
                {
                    mensaje = "Obesidad Clase 2 - Severamente Obeso";
                }
                else if (IMC>=40 && IMC<50)
                {
                    mensaje = "Obesidad Clase 2 - Severamente Obeso";
                }
                else if (IMC>=50)
                {
                    mensaje = "Obesidad Clase 3 - Críticamente Obeso";
                }

                Mensaje.setText(""+mensaje);
            }
            catch (Exception ex){
                Toast.makeText(Ejercicio2.this, "Datos no son correctos", Toast.LENGTH_SHORT).show();
            }


        }

        });
    }
}