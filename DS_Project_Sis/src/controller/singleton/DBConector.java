package controller.singleton;

import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public class DBConector {
    
    private static DBConector conexion = new DBConector();
    /**
     * Default constructor
     */
    public DBConector() {}

    /**
     * @return
     */
    public static DBConector getInstance() {
        // TODO implement here
        return conexion;
    }

}