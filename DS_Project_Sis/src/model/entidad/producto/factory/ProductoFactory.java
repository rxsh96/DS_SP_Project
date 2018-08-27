/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.producto.factory;

import model.entidad.producto.Lavadora;
import model.entidad.producto.Refrigeradora;
import model.entidad.producto.Cocina;

/**
 *
 * @author rxsh96
 */
public class ProductoFactory {
    
    public IProducto getProduct(String producto){
        if (producto == null) {
            return null;
        }
        else if(producto.equalsIgnoreCase("cocina")){
            return new Cocina();
        }
        else if(producto.equalsIgnoreCase("refrigeradora")){
            return new Refrigeradora();
        }
        else if(producto.equalsIgnoreCase("lavadora")){
            return new Lavadora();
        }
        return null;
    }
    
}
