/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chainOfResponsibility;

import model.entidad.persona.Empleado;

/**
 *
 * @author rxsh96
 */
public interface IAtencion {
    
    public void setNext(IAtencion atencion);
    public IAtencion getNext();
    public void atender(Empleado empleado);
    
    
    
}
