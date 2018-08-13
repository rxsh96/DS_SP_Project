/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import model.entidad.articulo.Articulo;

/**
 *
 * @author rxsh96
 */
public class ArticuloReporte implements Reporte{
    
    private String id;
    private Articulo articulo;
    private int cantidad;
    private double ventaTotal;

    @Override
    public void generarReporte() {
    }
    
}
