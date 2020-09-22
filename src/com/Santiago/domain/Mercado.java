package com.Santiago.domain;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public static byte CAPACIDAD = 84;
    private String supermecado;
    private ArrayList<Producto> productos;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String getSupermecado() {
        return supermecado;
    }

    public boolean agregar(Producto p, int codigo) {
        if (CAPACIDAD <= 0) {
            if (p.getCodigo() == codigo)
                return false;
            else{
                return false;
            }
        } else {
            productos.add(p);
            CAPACIDAD = (byte) (CAPACIDAD - 1);
            return true;
        }
    }

    public boolean retirar(String nombre){
        int productoRetirado = 0;
        for (int i = 0; i <= 84; i++) {
            if (productos.get(i).getNombre().equals(nombre)) {
                productoRetirado = productos.get(i).getCantidad() - 1;
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public Producto buscar(String nombre){
        for (int j = 1; j <= 84; j++){
            if (productos.get(j).getNombre().equals(nombre)){
                return getProductos().get(j);
            }
            else{
                return null;
            }
        }
        return null;
    }

    public Producto buscar(int codigo)
    {
        for (int k = 1; k <= 84; k++) {
            if (productos.get(k).getCodigo() == codigo) {
                return getProductos().get(k);

            } else {
                return null;
            }
        }
        return null;
    }

    public List<Producto> buscarPorTipo (String tipo){
        ArrayList<Producto> productos1 = new ArrayList<>();
        for (int l = 1; l <= 38; l++){
            if (productos.get(l).getTipo().equals(tipo)){
                return productos;
            }
            else{
                return productos1;
            }
        }
        return productos;
    }

    public int calcularTotal(){
        int sumaCantidad = 0, sumaPrecio = 0, multiplicacion;
        for (int i = 1; i <= 84; i++){
            sumaCantidad = productos.get(i).getCantidad() + sumaCantidad;
            sumaPrecio = productos.get(i).getPrecio() + sumaPrecio;
        }
        multiplicacion = sumaCantidad * sumaPrecio;
        return multiplicacion;
    }
}
//NOTA: Hay en algunas partes el equals, antes estaba el doble igual ==, pero java aclaraba que era mejor usar equals.
