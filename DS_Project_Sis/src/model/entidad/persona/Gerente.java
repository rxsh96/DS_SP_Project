/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.persona;
import model.entidad.persona.chainOfResponsibility.Empleado;

/**
 *
 * @author rxsh96
 */
public class Gerente extends Empleado {

    public Gerente() {
    }

    public Gerente(String cedula) {
        super(cedula);
    }


    @Override
    public void consultarCliente() {
    }

    public void consultarEmpleado() {
    }

    @Override
    public void consultarProducto() {
    }

    public void consultarVentas() {
    }
    
    public void consultarReporte() {
    }

}