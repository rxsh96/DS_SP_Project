/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.persona;

/**
 *
 * @author rxsh96
 */
public class Cliente extends Persona {

    private String direccion;
    private String telefono;
    
    public Cliente() {
    }

    public Cliente(String cedula) {
        super(cedula);
    }
    
    public Cliente(String cedula, String nombre, String apellido, int edad, String direccion, String telefono){
        super(cedula, nombre, apellido, edad);
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}