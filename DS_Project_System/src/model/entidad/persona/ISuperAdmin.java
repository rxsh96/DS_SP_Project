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
public interface ISuperAdmin extends IAdmin {
    
    public void crearUsuario();
    public void consultarUsuario();
    public void actualizarUsuario();
    public void emilinarUsuario();
    public void otorgarPermiso(Persona empleado);
}
