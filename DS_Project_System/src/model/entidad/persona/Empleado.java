/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.persona;

import model.chainOfResponsibility.IAtencion;
import model.decorator.IPermisos;

/**
 *
 * @author rxsh96
 */
public class Empleado extends Persona implements IPermisos, IAtencion{
    
    private IAtencion siguiente;
    
    public Empleado(String nombre) {
        super(nombre);
    }
    
    public void consultarProducto(){}
    
    public void consultarCliente(){}
    
    public void crearCliente(){}
    
    public void vender(){}
    
    public void realizarProforma(){}

    @Override
    public void editarDatosFactura() {
    }

    @Override
    public void editarVenta() {
    }

    @Override
    public void setNext(IAtencion atencion) {
        siguiente = atencion;
    }

    @Override
    public IAtencion getNext() {
        return siguiente;
    }

    @Override
    public void atender(Empleado empleado) {
        System.out.println("El empleado "+empleado.nombre+" atendiendo al cliente");
    }
    
}
