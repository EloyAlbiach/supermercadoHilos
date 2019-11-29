package com.iescamp.supermercado;

/**
 *
 * @author eloy
 * 
 * Para escenificar el final de la compra, existirá un producto llamado
 * "finDeCompra" que representa el separador de productos de cada cliente, este
 * producto tiene precio = 0.
 */
public class Producto {
    private final double precio;
    private final String nombre;

    public Producto(String unNombre, double unPrecio) {
        precio = Math.abs(unPrecio);
        nombre = unNombre;
    }

    public String obtenerNombreProducto() {
        return nombre;
    }

    public double obtenerPrecioProducto() {
        return precio;
    }
}
