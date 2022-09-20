package com.santiago.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
        return this.productos.stream().filter(m -> m.getNombre().equals(nombre)).toList().get(0);
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
        return this.productos.stream().filter(m -> m.getCodigo() == codigo).toList().get(0);
    }

    public List<Producto> buscarPorTipo (String tipo){
        return this.productos.stream().filter(m -> m.getTipo().equals(tipo)).toList();
    }

    public int calcularTotal(){
        AtomicInteger cantidadPorPrecio = new AtomicInteger();
        return this.productos.stream().mapToInt(
                p -> p.getCantidad()*p.getPrecio()).sum();

    }
}