/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import model.entidad.persona.Cliente;

/**
 *
 * @author rxsh96
 */
public class ClienteReporte implements Reporte {
    
    private Cliente cliente;
    private String id;
    private double montoPromedioMensual;

    @Override
    public void generarReporte() {
    }
            
    
}
