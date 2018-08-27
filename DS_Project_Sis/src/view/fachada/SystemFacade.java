/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.fachada;
import java.util.Scanner;
import view.*;

/**
 *
 * @author ASUS
 */
public class SystemFacade {
    
    private static final SystemFacade fachada = new SystemFacade();
    private static IView admin, empleado, gerente, superAdmin;

    public SystemFacade() {
        SystemFacade.admin = new AdminView();
        SystemFacade.superAdmin = new SuperAdminView();
        SystemFacade.empleado = new EmpleadoView();
        SystemFacade.gerente = new GerenteView();
    }

    public static SystemFacade getInstance() {
        System.out.println("Sistema de Línea Blanca S.A.");
        System.out.println("\t"+"Seleccione el usuario que desea abrir:");
        System.out.println("1.- Super Admin");
        System.out.println("2.- Admin");
        System.out.println("3.- Gerente");
        System.out.println("4.- Empleado");
        seleccionar();
        return fachada;
    }
    
    private static void seleccionar(){
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        System.out.println("");
        switch(op){
            case 1:
                SystemFacade.superAdmin.mostrarOpciones();
                break;
            case 2:
                SystemFacade.admin.mostrarOpciones();
                break;
            case 3:
                SystemFacade.gerente.mostrarOpciones();
                break;
            case 4:
                SystemFacade.empleado.mostrarOpciones();
                break;
            default:
                System.out.println("Seleccionó mal, chao");
        }
    }

}