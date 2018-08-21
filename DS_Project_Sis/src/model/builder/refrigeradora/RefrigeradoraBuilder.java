package model.builder.refrigeradora;

import java.util.*;
import model.entidad.articulo.Refrigeradora;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public abstract class RefrigeradoraBuilder {

    /**
     * Default constructor
     */
    public RefrigeradoraBuilder() {
    }

    /**
     * 
     */
    protected Refrigeradora refrigeradora;

    /**
     * @return
     */
    public Refrigeradora getRefrigeradora() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract void setEngine();

    /**
     * @return
     */
    public abstract void setCompresor();

    /**
     * @return
     */
    public abstract void setCondensador();

    /**
     * @return
     */
    public abstract void setPuertas();

}