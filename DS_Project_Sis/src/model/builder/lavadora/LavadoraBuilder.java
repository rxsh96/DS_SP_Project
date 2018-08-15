package model.builder.lavadora;

import java.util.*;
import model.entidad.articulo.Lavadora;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public abstract class LavadoraBuilder {

    /**
     * Default constructor
     */
    public LavadoraBuilder() {
    }

    /**
     * 
     */
    protected Lavadora lavadora;

    /**
     * @return
     */
    public Lavadora getLavadora() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract void setTambor();

    /**
     * @return
     */
    public abstract void setPuerta();

    /**
     * @return
     */
    public abstract void setPanelControl();

}