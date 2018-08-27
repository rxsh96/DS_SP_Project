/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.strategy.reporte;

/**
 *
 * @author rxsh96
 */
public class ReporteContext {
    
    private IReporte reporte;
    
    public void setReporte(IReporte reporte){
        this.reporte = reporte;
    }
    
    public void executeReporte(){
        this.reporte.generarReporte();
    }
    
}
