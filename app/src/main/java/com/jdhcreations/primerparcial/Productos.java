package com.jdhcreations.primerparcial;

public class Productos {

    String nombre;
    String codigo;
    String valor;
    String exIva;
    String categoria;
    String descripcion;

    public Productos(String nombre, String codigo, String valor, String exIva, String categoria, String descripcion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
        this.exIva = exIva;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setExIva(String exIva) {
        this.exIva = exIva;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }

    public String getExIva() {
        return exIva;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Productos[] listProd = new Productos[5];

    public void AgregarProducto(){
        for (int i = 0; i < listProd.length; i++) {
            listProd.getClass();
        }

    }

    public void MostrarArreglo(){
        for (int j = 0; j < listProd.length; j++){
            System.out.println(listProd[j]);
        }
    }


}
