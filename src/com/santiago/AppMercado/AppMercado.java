package com.santiago.AppMercado;

import com.santiago.domain.Mercado;
import com.santiago.domain.Producto;
import com.santiago.domain.tipoDeProducto;

import java.util.ArrayList;
import java.util.List;

public class AppMercado {
    public static void main(String[] args) {
        List<Producto> list = new ArrayList<>();
        Producto productoUno = new Producto(1, "Coca-Cola", 10, 2500, tipoDeProducto.GASEOSA);
        Producto productoDos = new Producto(2, "Papas de Limon", 5, 1000, tipoDeProducto.FRITURAS);
        Producto productoTres = new Producto(3, "Zucaritas", 4, 5000, tipoDeProducto.CEREALES);
        Producto productoCuatro = new Producto(4, "Bimbo", 7, 4000, tipoDeProducto.PAN);
        Producto productoCinco = new Producto(5, "Mora", 15, 1500, tipoDeProducto.FRUTA);
        Producto productoSeis = new Producto(6, "Alqueria", 5, 2500, tipoDeProducto.LACTEO);
        Producto productoSiete = new Producto(7, "Cilantro", 9, 1500, tipoDeProducto.VERDURA);


        Mercado superMercado = new Mercado("El mercado del hogar", list);
        superMercado.agregar(productoUno);
        superMercado.agregar(productoDos);
        /*for(int i = 0; i<superMercado.getProductos().size(); i++){
            System.out.println(superMercado.getProductos().get(i).getNombre());
        }

        System.out.println("Espacio jajajaja");
        System.out.println(superMercado.retirar("Coca-Cola"));
        for(int i = 0; i<superMercado.getProductos().size(); i++){
            System.out.println(superMercado.getProductos().get(i).getNombre());
        }*/
        //System.out.println(superMercado.calcularTotal());
        //System.out.println(superMercado.buscar(2).getNombre());
        System.out.println(superMercado.buscar("Coca-Cola").getNombre() + " "
                + superMercado.buscar("Coca-Cola").getPrecio());
        //System.out.println(superMercado.buscarPorTipo(tipoDeProducto.GASEOSA).get(0).getNombre());

    }
}
