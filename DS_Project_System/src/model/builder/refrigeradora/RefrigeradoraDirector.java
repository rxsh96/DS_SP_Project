/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.builder.refrigeradora;

import model.entidad.articulo.Refrigeradora;

/**
 *
 * @author rxsh96
 */
public class RefrigeradoraDirector {
    
    private RefrigeradoraBuilder rBuilder;
    
    public RefrigeradoraDirector(RefrigeradoraBuilder rBuilder ){
        this.rBuilder = rBuilder;
    }
    
    public void construirRefrigeradora(){
        rBuilder.setCompresor();
        rBuilder.setCondensador();
        rBuilder.setEngine();
        rBuilder.setPuertas();
    }
    
    public Refrigeradora getRefrigeradora(){
        return rBuilder.getRefrigeradora();
    }
    
}
