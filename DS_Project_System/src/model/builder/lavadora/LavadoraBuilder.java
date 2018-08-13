/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.builder.lavadora;

import model.entidad.articulo.Lavadora;

/**
 *
 * @author rxsh96
 */
public abstract class LavadoraBuilder {
    
    protected Lavadora lavadora;
    
    public Lavadora getLavadora(){
        return lavadora;
    }
    
    public abstract void setTambor();
    public abstract void setPuerta();
    public abstract void setPanelControl();
    
    
}
