/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.persona.observer;
import model.entidad.persona.chainOfResponsibility.Empleado;

/**
 *
 * @author rxsh96
 */
public class Admin extends Empleado implements IAdmin, Notificante {

    public Admin() {
    }

    public Admin(String cedula) {
        super(cedula);
    }

    @Override
    public void crearProducto() {
    }

    @Override
    public void consultarProducto() {
    }

    @Override
    public void actualizarProducto() {
    }

    @Override
    public void emilinarProducto() {
    }

    @Override
    public void crearVenta() {
    }

    @Override
    public void consultarVenta() {
    }

    @Override
    public void actualizarVenta() {
    }

    @Override
    public void emilinarVenta() {
    }

    public void notificacion() {
    }

    public void confirmarORechazarPeticion(Empleado e) {
    }

    @Override
    public void notificarPeticion() {
    }

}