package com.jdhcreations.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MostrarExentos extends AppCompatActivity implements View.OnClickListener {

    public TextView tvMostrarEx;
    public Button btnMostrarEx;

    public EditText nombre;
    public EditText codigo;
    public EditText valor;
    public EditText exiva;
    public EditText categoria;
    public EditText descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_exentos);

        tvMostrarEx = findViewById(R.id.tvMostrarExentos);
        btnMostrarEx = findViewById(R.id.btnMostrarExentos);

        btnMostrarEx.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String etnombre = nombre.getText().toString().trim();
        String etcodigo = codigo.getText().toString().trim();
        String etvalor = valor.getText().toString().trim();
        String etexiva = exiva.getText().toString().trim();
        String etcategoria = categoria.getText().toString().trim();
        String etdescripcion = descripcion.getText().toString().trim();

        Productos prod = new Productos(etnombre, etcodigo, etvalor, etexiva, etcategoria, etdescripcion);
        prod.MostrarArreglo();
    }
}