package com.santiago.domain;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private byte capacidad = 84;
    private final String supermecado;
    private List<Producto> productos;

    public Mercado(String supermecado, List<Producto> productos) {
        this.supermecado = supermecado;
        this.productos = productos;
    }

    public String getSupermecado() {
        return supermecado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public boolean agregar(Producto p) {
        int analisisCantidad = (byte) (capacidad - p.getCantidad());
        if(capacidad > 0 && capacidad <= 84){
            if(analisisCantidad >= 0){
                this.productos.add(p);
                capacidad = (byte) (capacidad - p.getCantidad());
                return true;
            }
            else{
                System.out.println("Ya no se pueden poner más productos en el mercado");
                return false;
            }
        }else {
            System.out.println("Ya no se pueden poner más productos en el mercado");
            return false;
        }
    }

    public Producto buscar(String nombre){
        Producto productoEncontrado = null;
        for (int j = 0; j <= this.productos.size(); j++){
            if (productos.get(j).getNombre().equals(nombre)){
                productoEncontrado = new Producto(this.productos.get(j).getCodigo(),
                        this.productos.get(j).getNombre(),
                        this.productos.get(j).getCantidad(),
                        this.productos.get(j).getPrecio(),
                        this.productos.get(j).getTipo());
                break;
            }
        }
        return productoEncontrado;
    }

    public int buscarIndice(String nombre){
        int valor = 0;
        for (int j = 0; j <= this.productos.size(); j++){
            if (productos.get(j).getNombre().equals(nombre)){
                valor = j;
                break;
            }
        }
        return valor;
    }

    public boolean retirar(String nombre){
        Producto producto = this.buscar(nombre);
        int indice = this.buscarIndice(nombre);
        if(producto != null){
            capacidad = (byte) (capacidad + producto.getCantidad());
            this.productos.remove(indice);
            return true;
        }else {
            return false;
        }
    }

    public Producto buscar(int codigo)
    {
        Producto productoEncontrado = null;
        for (int k = 0; k <= this.productos.size(); k++) {
            if (productos.get(k).getCodigo() == codigo) {
                productoEncontrado = new Producto(this.productos.get(k).getCodigo(),
                        this.productos.get(k).getNombre(),
                        this.productos.get(k).getCantidad(),
                        this.productos.get(k).getPrecio(),
                        this.productos.get(k).getTipo());
                break;
            }
        }
        return productoEncontrado;
    }

    public List<Producto> buscarPorTipo (String tipo){
        List<Producto> list = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getTipo().equals(tipo)) {
                list.add(producto);
                break;
            }
        }
        return list;
    }

    public int calcularTotal(){
        int cantidadPorPrecio = 0;
        for (int i = 0; i <this.productos.size(); i++){
            cantidadPorPrecio = (this.productos.get(i).getPrecio() *
                                this.productos.get(i).getCantidad()) + cantidadPorPrecio;
        }
        return cantidadPorPrecio;
    }
}