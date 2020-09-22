package com.Santiago.AppMercado;

import com.Santiago.domain.Mercado;
import com.Santiago.domain.Producto;
import com.Santiago.domain.TipoDeProducto;

public class AppMercado {
    public static void main(String[] args) {
        Mercado superMercado = new Mercado();
        Producto producto1 = new Producto(1, "Coca-Cola", 10, 2500, TipoDeProducto.GASEOSA);
        Producto producto2 = new Producto(2, "Papas de Limon", 5, 1000, TipoDeProducto.FRITURAS);
        Producto producto3 = new Producto(3, "Zucaritas", 4, 5000, TipoDeProducto.CEREALES);
        Producto producto4 = new Producto(4, "Bimbo", 7, 4000, TipoDeProducto.PAN);
        Producto producto5 = new Producto(5, "Mora", 15, 1500, TipoDeProducto.FRUTA);
        Producto producto6 = new Producto(6, "Alqueria", 5, 2500, TipoDeProducto.LACTEO);
        Producto producto7 = new Producto(7, "Cilantro", 9, 1500, TipoDeProducto.VERDURA);

        superMercado.agregar(producto1, 1);
        superMercado.agregar(producto2, 2);
        //superMercado.retirar("Zucaritas");
        superMercado.calcularTotal();
        superMercado.buscar(2);
        superMercado.buscar("Coca-Cola");
        superMercado.buscarPorTipo("CEREALES");

    }
}
