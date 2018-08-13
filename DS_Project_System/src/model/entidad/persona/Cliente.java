/*
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
    
    public Cliente(String nombre) {
        super(nombre);
    }

    public Cliente(String nombre, String direccion, String telefono) {
        super(nombre);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    
}
