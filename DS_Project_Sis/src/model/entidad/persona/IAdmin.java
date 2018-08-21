package model.entidad.persona;

import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public interface IAdmin {

    /**
     * @return
     */
    public void crearProducto();

    /**
     * @return
     */
    public void consultarProducto();

    /**
     * @return
     */
    public void actualizarProducto();

    /**
     * @return
     */
    public void emilinarProducto();

    /**
     * @return
     */
    public void crearVenta();

    /**
     * @return
     */
    public void consultarVenta();

    /**
     * @return
     */
    public void actualizarVenta();

    /**
     * @return
     */
    public void emilinarVenta();

}