package com.iescamp.supermercado;

import java.util.LinkedList;

/**
 *
 * @author eloy
 */
public class CarroCompra {
    private final LinkedList<Producto> carro;
    
    public CarroCompra(){
        carro = new LinkedList<>();
    }
    
    public void poner(Producto producto){
        carro.add(producto);
    }
    
    public Producto coger(){
        return carro.remove();
    }
    
    public Boolean vacio(){
        return carro.isEmpty();
    }
}
