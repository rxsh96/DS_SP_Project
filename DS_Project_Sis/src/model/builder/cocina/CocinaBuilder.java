package model.builder.cocina;

import java.util.*;
import model.entidad.articulo.Cocina;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public abstract class CocinaBuilder {

    /**
     * Default constructor
     */
    public CocinaBuilder() {
    }

    /**
     * 
     */
    protected Cocina cocina;

    /**
     * @return
     */
    public Cocina getCocina() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract void setInductores();

    /**
     * @return
     */
    public abstract void setBoosters();

    /**
     * @return
     */
    public abstract void setHornoElectrico();

}