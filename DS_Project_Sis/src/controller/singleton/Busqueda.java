package controller.singleton;

import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public class Busqueda {
    
    private static Busqueda busqueda = new Busqueda();

    /**
     * Default constructor
     */
    public Busqueda(){}

    /**
     * @return
     */
    public static Busqueda getInstance() {
        // TODO implement here
        return busqueda;
    }

}