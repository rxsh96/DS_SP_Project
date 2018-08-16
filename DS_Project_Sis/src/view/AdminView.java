package view;

import java.util.*;
import view.fachada.SystemFacade;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public class AdminView implements IView {

    /**
     * Default constructor
     */
    public AdminView() {
    }
    
    @Override
    public SystemFacade volver() {
        return SystemFacade.getInstance();
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("---Vista Admin---");
        String a = sc.nextLine();
        volver();
    }

    

}