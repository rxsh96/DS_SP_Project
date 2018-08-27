
package ds_project_sis;

import controller.singleton.DBConector;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXML_LogInController implements Initializable {

    @FXML private Text log;
    @FXML private TextField user;
    @FXML private PasswordField pass;
    @FXML private Button ingresar_login;
    @FXML private Button salir;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private Connection loadDB() throws SQLException{
        return DBConector.getInstance().getConnection();
    }
    
    @FXML 
    private void accion_Ingresar(ActionEvent event) throws IOException, SQLException{
        String us = user.getText();
        String pas = pass.getText();   

        if (us.equals("Administrador") && pas.equals("pass")){
            try {
                FXMLLoader loader = new FXMLLoader();
                ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_Administrador.fxml").openStream());
                FXML_AdministradorController adm = (FXML_AdministradorController)loader.getController();
                adm.load(loadDB(), "Administrador");
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.centerOnScreen();
                stage.show();
            } 
            catch (IOException ex) {
                Logger.getLogger(FXML_LogInController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (us.equals("Super") && pas.equals("pass")){
            try {
                FXMLLoader loader = new FXMLLoader();
                ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_superAdministrador.fxml").openStream());
                FXML_superAdministradorController superAdm = (FXML_superAdministradorController)loader.getController();
                superAdm.load(loadDB(), "Super Administrador");
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.centerOnScreen();
                stage.show();
            } 
            catch (IOException ex) {
                Logger.getLogger(FXML_LogInController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (us.equals("Gerente") && pas.equals("pass")){
            try {
                FXMLLoader loader = new FXMLLoader();
                ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_Gerente.fxml").openStream());
                FXML_GerenteController gerente = (FXML_GerenteController)loader.getController();
                gerente.load(loadDB(), "Gerente");
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.centerOnScreen();
                stage.show();
            } 
            catch (IOException ex) {
                Logger.getLogger(FXML_LogInController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (us.equals("Vendedor") && pas.equals("pass")){
            try {
                FXMLLoader loader = new FXMLLoader();
                ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_Vendedor.fxml").openStream());
                FXML_VendedorController vendedor = (FXML_VendedorController)loader.getController();
                vendedor.load(loadDB(), "Vendedor");
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.centerOnScreen();
                stage.show();
            } 
            catch (IOException ex) {
                Logger.getLogger(FXML_LogInController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            // muestra un cuadro de diálogo joptionpane usando showMessageDialog
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta, porfavor vuelva a introducir los datos.");
            user.setText(null);
            pass.setText(null);
        }
    }  
    
    @FXML
    private void accion_Salir(ActionEvent event) {
        System.exit(0);
    }
    
}
