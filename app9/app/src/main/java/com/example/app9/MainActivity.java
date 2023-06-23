package com.example.app9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText nombreEnv, poderEnv;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void registrar(View v){
        //Obteniendo los valores de los EditText
        nombreEnv = (EditText) findViewById(R.id.et_nombre);
        poderEnv = (EditText) findViewById(R.id.et_poder);
        sp = (Spinner) findViewById(R.id.sp_categoria);

        //obtencion de datos de los EditText
        String nombreEnv1 = nombreEnv.getText().toString();
        String poderEnv1 = poderEnv.getText().toString();
        String categoria = sp.getSelectedItem().toString();

        //instanciar el objeto heroe
        Heroe heroe = new Heroe(nombreEnv1,poderEnv1, categoria);

        //Intent que va desde el activity actual hacia el activity_recepcion
        Intent it = new Intent(getApplicationContext(),Recepcion.class);

        Bundle bundle = new Bundle(); //empaquetado de objeto u elementos
        bundle.putSerializable("llaveHeroe",heroe);//envio de valor hacia otro activity

        it.putExtras(bundle);
        //Accion de envio
        startActivity(it);



    }
}