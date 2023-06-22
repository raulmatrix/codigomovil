package com.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected  int valor1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ventana2(View v){
        valor1 = 15;
        Intent it = new Intent(getApplicationContext(),Principal.class);
        it.putExtra("llave1",valor1);
        startActivity(it);
    }
}