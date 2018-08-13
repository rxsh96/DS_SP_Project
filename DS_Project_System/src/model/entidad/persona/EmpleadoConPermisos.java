/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.persona;

import model.decorator.EmpleadoDecorator;

/**
 *
 * @author rxsh96
 */
public class EmpleadoConPermisos extends EmpleadoDecorator{
    
    public EmpleadoConPermisos(Empleado empleado) {
        super(empleado);
    }
    
    @Override
    public void editarDatosFactura(){  
       super.editarDatosFactura();
    }
    
    @Override
    public void editarVenta(){
        super.editarVenta();
    }
    
}
