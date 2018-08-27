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
public class Persona {

    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Persona() {
    }

    public Persona(String cedula) {
        this.cedula = cedula;
    }
    
    public Persona(String cedula, String nombre, String apellido, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    
}