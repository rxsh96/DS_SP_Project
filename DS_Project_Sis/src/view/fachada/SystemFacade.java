package view.fachada;

import java.util.*;
import model.entidad.persona.Persona;
import view.IView;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public class SystemFacade {
    
    private SystemFacade fachada = new SystemFacade();

    /**
     * Default constructor
     */
    public SystemFacade() {
    }
    
    /**
     * @param persona 
     * @return
     */
    public IView showSystem(Persona persona) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static SystemFacade getInstance() {
        // TODO implement here
        return null;
    }

}