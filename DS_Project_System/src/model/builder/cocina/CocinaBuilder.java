/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.builder.cocina;

import model.entidad.articulo.Cocina;

/**
 *
 * @author rxsh96
 */
public abstract class CocinaBuilder {
      
    protected Cocina cocina;
        
    public Cocina getCocina(){
        return cocina;
    }
    
    public abstract void setInductores();
    public abstract void setBoosters();
    public abstract void setHornoElectrico();
    
}
