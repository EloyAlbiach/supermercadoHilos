package com.iescamp.supermercado;

/**
 *
 * @author eloy
 */
public class Ejecutable {
    public static void main(String[] args){
        
        CintaTransportadora linea1 = new CintaTransportadora();
        CarroCompra carro1 = new CarroCompra();
        Ticket ticket1 = new Ticket();
        
        // Creamos los productos del carro de la compra
        Producto p1 = new Producto("desodorante", 2.5);
        Producto p2 = new Producto("cepillo dientes", 3.0);
        Producto p3 = new Producto("galletas", 1);
        Producto p4 = new Producto("zanahorias", 1.8);
        Producto p5 = new Producto("manzanas", 2);
        Producto p6 = new Producto("panecillos", 0.7);
        Producto p7 = new Producto("detergente", 4.5);
        Producto p8 = new Producto("natillas", 1);
        Producto p9 = new Producto("lechuga", 0.7);
        Producto p10 = new Producto("pasta dientes", 1.5);
        Producto p11 = new Producto("finDeCompra", 0.0);
        
        // Llenamos el carro de productos
        carro1.poner(p1);
        carro1.poner(p2);
        carro1.poner(p3);
        carro1.poner(p4);
        carro1.poner(p5);
        carro1.poner(p6);
        carro1.poner(p7);
        carro1.poner(p8);
        carro1.poner(p9);
        carro1.poner(p10);
        carro1.poner(p11);
        
        Cliente cliente1 = new Cliente(carro1, linea1);
        Cajero cajero1 = new Cajero(linea1, ticket1);
        
        cajero1.start();
        cliente1.start();
        
    }
}
