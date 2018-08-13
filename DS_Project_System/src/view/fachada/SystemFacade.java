/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.fachada;

import model.entidad.persona.*;
import view.*;
/**
 *
 * @author rxsh96
 */
public class SystemFacade {
    
    public IView showSystem(Persona persona){
        if (persona instanceof Empleado) {
            return new EmpleadoView();
        }
        else if (persona instanceof Cliente) {
            return new ClienteView();
        }
        else if (persona instanceof Gerente) {
            return new GerenteView();
        }
        return new AdminView();
    }
    
}
