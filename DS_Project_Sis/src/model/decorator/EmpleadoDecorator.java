/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.decorator;

/**
 *
 * @author rxsh96
 */
public class EmpleadoDecorator implements IPermisosEmpleado{
    
    private IPermisosEmpleado permisosEmpleado;

    public EmpleadoDecorator(IPermisosEmpleado permisosEmpleado){
        this.permisosEmpleado = permisosEmpleado;
    }

    @Override
    public void editarFactura() {
        
    }

    @Override
    public void editarVenta() {
        
    }
    
 
    
}
