/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the 
public class Empleado extends Persona editor.
*/
package model.entidad.persona.chainOfResponsibility;
import model.entidad.persona.observer.Notificante;
import model.strategy.pago.FormaPago;
import model.decorator.IPermisosEmpleado;
import model.entidad.persona.Persona;

/**
 *
 * @author rxsh96
 */
public class Empleado extends Persona implements IPermisosEmpleado, IAtencion {
    
    protected Empleado empleado;
    protected Notificante notificante;
    protected FormaPago formaPago;


    public Empleado() {
    }

    public Empleado(String cedula) {
        super(cedula);
    }

 
    public void consultarProducto() {
    }

    
    public void consultarCliente() {
    }


    public void crearCliente() {
    }

 
    public void vender() {
    }


    public void realizarProforma() {
    }


    @Override
    public void editarFactura() {
    }


    @Override
    public void editarVenta() {
    }

  
    @Override
    public void atender(Empleado empleado) {
    }

    
    public void notificarPeticion() {
    }

    @Override
    public void setNext(IAtencion atencion) {
    }

    @Override
    public IAtencion getNext() {
       return null;
    }

}