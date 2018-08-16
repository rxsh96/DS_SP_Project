/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import view.fachada.SystemFacade;

/**
 *
 * @author ASUS
 */
public class SuperAdminView implements IView {

    /**
     * Default constructor
     */
    public SuperAdminView() {
    }

    @Override
    public SystemFacade volver() {
        return SystemFacade.getInstance();
    }
    
    @Override
    public void mostrarOpciones() {
        System.out.println("---Vista Super Admin---");
        String a = sc.nextLine();
        volver();
    }
}
