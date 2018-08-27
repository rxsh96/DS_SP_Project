/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import view.fachada.SystemFacade;

/**
 *
 * @author rxsh96
 */
public class ClienteView implements IView {

    public ClienteView() {        
    }

    @Override
    public SystemFacade volver() {
        return SystemFacade.getInstance();
    }
    
    @Override
    public void mostrarOpciones() {
        System.out.println("---Vista Cliente---");
        String a = sc.next();
        volver();
    }

}