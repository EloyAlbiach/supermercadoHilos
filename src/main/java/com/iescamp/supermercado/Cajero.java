package com.iescamp.supermercado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eloy
 */
public class Cajero extends Thread{
    private final CintaTransportadora cinta;
    private Boolean cintaConProductos = true;

    private final Ticket ticket;
    
    public Cajero(CintaTransportadora unaCinta, Ticket unTicket){
        cinta = unaCinta;
        ticket = unTicket;
    }
    
    @Override
    public void run(){
        Producto p;
        do{
            try {
                System.out.println("cajero intenta coger producto ...");
                p = cinta.tomarProducto();
                
                if(p.obtenerNombreProducto().equals("finDeCompra") ){
                    cintaConProductos = false;
                }
                ticket.incrementar(p.obtenerPrecioProducto());
                System.out.println("cajero coge producto: " + p.obtenerNombreProducto() + " Precio: " + p.obtenerPrecioProducto());
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
                Thread.currentThread().interrupt();
            }
        }while (Boolean.TRUE.equals(cintaConProductos));
        
        System.out.println("Precio total compra: " + ticket.obtenerTotalAcumulado());
    }
}
