/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.decorator;

import model.entidad.persona.Empleado;

/**
 *
 * @author rxsh96
 */
public abstract class EmpleadoDecorator implements IPermisos{
    
    protected Empleado empleado;
    
    public EmpleadoDecorator(Empleado empleado){
        this.empleado = empleado;
    }
    
    @Override
    public void editarDatosFactura(){  
        this.empleado.editarDatosFactura();
    }
    
    @Override
    public void editarVenta(){
        this.empleado.editarVenta();
    }
    
}
