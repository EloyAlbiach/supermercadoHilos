package com.iescamp.supermercado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eloy
 */
public class Cliente extends Thread{
    private final CarroCompra carro;
    private final CintaTransportadora cinta;
    
    public Cliente(CarroCompra unCarro, CintaTransportadora unaCinta){
        cinta = unaCinta;
        carro = unCarro;
    }
    
    @Override
    public void run(){
        Producto p;
        while (!carro.vacio()){
            try {
                sleep(10);
                p = carro.coger();
                System.out.println("Cliente intenta dejar " + p.obtenerNombreProducto());
                cinta.depositarProducto(p);
                System.out.println("Cliente deja " + p.obtenerNombreProducto() + " con precio: " + p.obtenerPrecioProducto());
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
