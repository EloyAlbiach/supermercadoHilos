package com.iescamp.supermercado;

/**
 *
 * @author eloy
 */
public class Ticket {
    private double total = 0;
    
    public void incrementar(double precio){
        total += Math.abs(precio);
    }
    
    public double obtenerTotalAcumulado(){
        return total;
    }
}
