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
public class DBConector {
    
    private static DBConector conexion;
    
    private DBConector(){}
    
    public static DBConector getInstance(){
        if (DBConector.conexion == null) {
            DBConector.conexion = new DBConector();
        }
        return DBConector.conexion;
    }
    
}
