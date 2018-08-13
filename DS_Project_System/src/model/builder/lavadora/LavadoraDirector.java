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
public class LavadoraDirector {
    
    private LavadoraBuilder lBuilder;
    
    public LavadoraDirector(LavadoraBuilder lBuilder){
        this.lBuilder = lBuilder;
    }
    
    public void construirLavadora(){
        lBuilder.setPanelControl();
        lBuilder.setPuerta();
        lBuilder.setTambor();
    }
    
    public Lavadora getLavadora(){
        return lBuilder.getLavadora();
    }
    
}
