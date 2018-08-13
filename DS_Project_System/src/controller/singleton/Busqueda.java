/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.singleton;

/**
 *
 * @author rxsh96
 */
public class Busqueda {
    
    private static Busqueda buscar;
    
    private Busqueda(){}
    
    public static Busqueda getInstance(){
        if (Busqueda.buscar == null) {
            Busqueda.buscar = new Busqueda();
        }
        return Busqueda.buscar;
    }
    
}
