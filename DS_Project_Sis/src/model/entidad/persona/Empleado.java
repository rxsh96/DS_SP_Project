package model.entidad.persona;

import java.util.*;
import model.chainOfResponsibility.IAtencion;
import model.decorator.EmpleadoDecorator;
import model.decorator.EmpleadoInterface;
import model.entidad.observer.Notificante;
import model.strategy.FormaPago;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the 
public class Empleado extends Persona editor.
 * @author rxsh96
 */
public class Empleado implements EmpleadoInterface, IAtencion {
    
    protected Empleado empleado;
    private Notificante notificante;
    private FormaPago formaPago;

    /**
     * Default constructor
     */
    public Empleado() {
    }




    /**
     * @param nombre
     */
    public void Empleado(String nombre) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void consultarProducto() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void consultarCliente() {

    }

    /**
     * @return
     */
    public void crearCliente() {

    }

    /**
     * @return
     */
    public void vender() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void realizarProforma() {

    }

    /**
     * @return
     */
    public void editarDatosFactura() {

    }

    /**
     * @return
     */
    public void editarVenta() {

    }

    /**
     * @param atencion 
     * @return
     */


    /**
     * @param empleado 
     * @return
     */
    public void atender(Empleado empleado) {
        // TODO implement here

    }

    /**
     * 
     */
    public void notificarPeticion() {
        // TODO implement here
    }


    @Override
    public void solicitarPermiso() {
        
    }

    @Override
    public void setNext(IAtencion atencion) {
        
    }

    @Override
    public IAtencion getNext() {
       return null;
    }

}