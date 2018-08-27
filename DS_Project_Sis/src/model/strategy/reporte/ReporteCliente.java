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
public class ReporteCliente implements IReporte{

    @Override
    public void generarReporte() {
        System.out.println("Este es un reporte de un Cliente");
    }
    
}
