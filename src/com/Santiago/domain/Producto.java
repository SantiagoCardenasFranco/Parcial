package com.Santiago.domain;

public class Producto {
    private int codigo;
    private String nombre;
    private int cantidad;
    private int precio;
    private String tipo;

    public Producto(int codigo, String nombre, int cantidad, int precio, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return this.tipo;
    }
}

