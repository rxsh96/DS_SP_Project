/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import view.fachada.SystemFacade;

/**
 *
 * @author rxsh96
 */
public interface IView {
    Scanner sc = new Scanner(System.in);   
    public void mostrarOpciones();
    public SystemFacade volver();
}