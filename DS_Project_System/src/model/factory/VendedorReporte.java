/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import model.entidad.persona.Empleado;

/**
 *
 * @author rxsh96
 */
public class VendedorReporte implements Reporte{
            
    private String id;
    private Empleado vendedor;
    private int numeroVentas;
    private double totalVentas;
    
    @Override
    public void generarReporte() {
    }
    
}
