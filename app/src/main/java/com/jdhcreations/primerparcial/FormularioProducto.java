package com.jdhcreations.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioProducto extends AppCompatActivity implements View.OnClickListener {

    public EditText nombre;
    public EditText codigo;
    public EditText valor;
    public EditText exiva;
    public EditText categoria;
    public EditText descripcion;
    public Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_producto);


        nombre = findViewById(R.id.txtNombre);
        codigo = findViewById(R.id.txtCodigo);
        valor = findViewById(R.id.txtValor);
        exiva = findViewById(R.id.txtExiva);
        categoria = findViewById(R.id.txtCategoria);
        descripcion = findViewById(R.id.txtDescripcion);
        btnAdd = findViewById(R.id.btnAgregar);

        btnAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String etnombre = nombre.getText().toString().trim();
        String etcodigo = codigo.getText().toString().trim();
        String etvalor = valor.getText().toString().trim();
        String etexiva = exiva.getText().toString().trim();
        String etcategoria = categoria.getText().toString().trim();
        String etdescripcion = descripcion.getText().toString().trim();

        if(!etnombre.isEmpty() && !etcodigo.isEmpty() && !etvalor.isEmpty() && !etexiva.isEmpty() && !etcategoria.isEmpty() && !etdescripcion.isEmpty()){
           Productos pr = new Productos(etnombre, etcodigo, etvalor, etexiva, etcategoria, etdescripcion);
           pr.AgregarProducto();
           Intent volverAlInicio = new Intent(this, MainActivity.class);
           startActivity(volverAlInicio);

        }else{
            Toast.makeText(this, "Ingrese la informacion restantee", Toast.LENGTH_SHORT).show();
        }
    }
}