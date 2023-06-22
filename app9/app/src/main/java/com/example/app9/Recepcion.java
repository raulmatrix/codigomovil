package com.example.app9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Recepcion extends AppCompatActivity {
    TextView nombre,poder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepcion);

        //INICIALIZANDO

        nombre = (TextView) findViewById(R.id.tv_nombre);
        poder = (TextView) findViewById(R.id.tv_poder);

        Bundle objEnviado = getIntent().getExtras();
        Heroe heroe = null;
        //obtencion del objeto heroe
        heroe = (Heroe) objEnviado.getSerializable("llaveHeroe");

        //setde valores en los textview
        nombre.setText(heroe.getNombre().toString());
        poder.setText(heroe.getPoder().toString());
    }
}