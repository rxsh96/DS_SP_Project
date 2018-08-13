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
public abstract class RefrigeradoraBuilder {
    
    protected Refrigeradora refrigeradora;
    
    public Refrigeradora getRefrigeradora(){
        return this.refrigeradora;
    }
    
    public abstract void setEngine();
    public abstract void setCompresor();
    public abstract void setCondensador();
    public abstract void setPuertas();
    
}
