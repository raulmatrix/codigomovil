package com.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    TextView mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        mostrar = (TextView) findViewById(R.id.tv_mostrar);

        //recepcion del valor
        int recepcion = getIntent().getIntExtra("llave1",0);

        mostrar.setText(""+recepcion);
    }
}