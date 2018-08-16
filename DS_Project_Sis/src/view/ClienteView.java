package view;

import java.util.*;
import view.fachada.SystemFacade;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author rxsh96
 */
public class ClienteView implements IView {

    /**
     * Default constructor
     */
    public ClienteView() {
        
    }

    @Override
    public SystemFacade volver() {
        return SystemFacade.getInstance();
    }
    
    @Override
    public void mostrarOpciones() {
        System.out.println("---Vista Cliente---");
        Scanner sc = new Scanner(System.in);
        sc.next();
        volver();
    }

}