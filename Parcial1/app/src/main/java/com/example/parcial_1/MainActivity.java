package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity
        extends AppCompatActivity {Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btnE1);
        btn2=findViewById(R.id.btnE2);

        btn1.setOnClickListener(new View.OnClickListener()
        {            @Override            public void onClick(View view) {
            Parcial("Ejercicio_1");
        }        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {
                Parcial("Ejercicio_2");

            }
        });
    }
    public void Parcial(String msj){

        Intent intentar= new Intent();
        if (msj.equals("Ejercicio_1"))
        {
            intentar= new Intent(this,Ejercicio1.class);
        }
        else if (msj.equals("Ejercicio_2"))
        {
            intentar= new Intent(this,Ejercicio2.class);
        }
        startActivity(intentar);

    }
}