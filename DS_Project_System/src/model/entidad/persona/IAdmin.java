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
public interface IAdmin {
    
    public void crearProducto();
    public void consultarProducto();
    public void actualizarProducto();
    public void emilinarProducto();
    
    public void crearVenta();
    public void consultarVenta();
    public void actualizarVenta();
    public void emilinarVenta();
    
}
