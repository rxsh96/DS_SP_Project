/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.persona.observer;
import model.entidad.persona.Persona;

/**
 *
 * @author rxsh96
 */
public class SuperAdmin extends Admin implements ISuperAdmin {

    public SuperAdmin() {
    }

    public SuperAdmin(String cedula) {
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

    @Override
    public void crearUsuario() {
    }
    
    @Override
    public void consultarUsuario() {
    }

  
    @Override
    public void actualizarUsuario() {
    }


    @Override
    public void emilinarUsuario() {
    }

   
    @Override
    public void otorgarPermiso(Persona empleado) {
    }

}