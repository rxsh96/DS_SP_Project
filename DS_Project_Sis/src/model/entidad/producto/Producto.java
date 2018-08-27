/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.producto;

import model.entidad.producto.factory.IProducto;

/**
 *
 * @author rxsh96
 */
public class Producto implements IProducto{

    protected String id;
    protected String categoria;
    protected String nombre;
    protected int cantidad;
    protected double precio;
    
    public Producto() {
    }

    public Producto(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Articulo{" + "ID=" + id + ", Categoria=" + categoria + 
                ", Nombre=" + nombre + ", Cantidad=" + cantidad + 
                ", Precio=" + precio + '}';
    }

    @Override
    public void construir() {
        System.out.println("Contruyendo un Producto!    ");
    }

}