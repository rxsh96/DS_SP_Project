package model.entidad.persona;

import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public interface ISuperAdmin extends IAdmin {

    /**
     * @return
     */
    public void crearUsuario();

    /**
     * @return
     */
    public void consultarUsuario();

    /**
     * @return
     */
    public void actualizarUsuario();

    /**
     * @return
     */
    public void emilinarUsuario();

    /**
     * @param empleado 
     * @return
     */
    public void otorgarPermiso(Persona empleado);

}