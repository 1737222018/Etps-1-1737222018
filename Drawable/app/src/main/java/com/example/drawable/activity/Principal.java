package com.example.drawable.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.drawable.R;

public class Principal extends AppCompatActivity {

    EditText edtUserMsj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Bundle bundle=getIntent().getExtras();
        edtUserMsj=findViewById(R.id.edtusers);
        String inform="Hola ,"+bundle.getString("usuario");
        edtUserMsj.setText(inform);


    }
}