/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

/**
 *
 * @author rxsh96
 */
public class CreatorReporteArticulo extends Creator{

    @Override
    public Reporte factoryReport() {
        return new ArticuloReporte();
    }
    
    
    
}
