package com.jdhcreations.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


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
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtNombre);
        codigo = findViewById(R.id.txtCodigo);
        valor = findViewById(R.id.txtValor);
        exiva = findViewById(R.id.txtExiva);
        categoria = findViewById(R.id.txtCategoria);
        descripcion = findViewById(R.id.txtDescripcion);
        btnAdd = findViewById(R.id.btnAgregar);
    }


    public void vistaAgregarProducto(View view){
        Intent FormularioAgregarPr = new Intent(this, FormularioProducto.class);
        startActivity(FormularioAgregarPr);
    }

    public void vistaVerExentos(View view){
        Intent VerEx = new Intent(this, MostrarExentos.class);
        startActivity(VerEx);
    }


}