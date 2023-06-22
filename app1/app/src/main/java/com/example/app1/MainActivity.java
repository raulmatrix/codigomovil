package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    TextView tv1;

    int contador=0;
    int valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et_valor);
        tv1 = (TextView) findViewById(R.id.tv_numero);

    }

    public void incrementar(View v){
        valor = Integer.parseInt(et1.getText().toString());
        contador = valor;
        contador++;
        et1.setText(""+contador);
    }

    public void decrementar(View v){
        int valor2 = Integer.parseInt(tv1.getText().toString());
        if(valor2<=0){
            Toast.makeText(getApplicationContext(), "No se puede decrementar menor a 0", Toast.LENGTH_SHORT).show();
        }
        else{
            contador--;
            tv1.setText(""+contador);
        }

    }
}