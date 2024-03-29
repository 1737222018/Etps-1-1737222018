package com.example.drawable.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.drawable.R;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout btnIniciar;
    EditText edtuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btnInicio);
        edtuser = findViewById(R.id.edtusers);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Principal.class);
                i.putExtra("usuario",edtuser.getText().toString());
                startActivity(i);
            }
        });
    }
}