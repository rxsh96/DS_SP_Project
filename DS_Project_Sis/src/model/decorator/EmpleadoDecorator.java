package model.decorator;

import java.util.*;
import model.entidad.persona.FXML_Empleado;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public abstract class EmpleadoDecorator implements EmpleadoInterface {

    /**
     * Default constructor
     */
    public EmpleadoDecorator() {
    }

    /**
     * 
     */
    protected EmpleadoInterface empleado;


    /**
     * @param empleado
     */
    public void EmpleadoDecorator(FXML_Empleado empleado) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void editarDatosFactura() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void editarVenta() {
        // TODO implement here

    }

}