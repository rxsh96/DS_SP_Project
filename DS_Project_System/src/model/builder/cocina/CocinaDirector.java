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
public class CocinaDirector {
    
    private CocinaBuilder cBuilder;
    
    public CocinaDirector(CocinaBuilder cbuilder){
        this.cBuilder = cbuilder;
    }
    
    public void construirCocina(){
        cBuilder.setInductores();
        cBuilder.setBoosters();
        cBuilder.setHornoElectrico();
    }
    
    public Cocina getCocina(){
        return cBuilder.getCocina();
    }
    
}
