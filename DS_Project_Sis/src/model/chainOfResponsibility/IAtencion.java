package model.chainOfResponsibility;

import java.util.*;
import model.entidad.persona.Empleado;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public interface IAtencion {

    /**
     * @param atencion 
     * @return
     */
    public void setNext(IAtencion atencion);

    /**
     * @return
     */
    public IAtencion getNext();

    /**
     * @param empleado 
     * @return
     */
    public void atender(Empleado empleado);

}