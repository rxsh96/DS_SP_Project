
package ds_project_sis;

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
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Empleado implements Initializable {

    @FXML
    private Button salir;
    @FXML
    private Button regresar;
    @FXML
    private Button administrador;
    @FXML
    private Button gerente;
    @FXML
    private Button vendedor;

    private Connection c;
    private String user;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void load(Connection c, String user){
        this.c = c;
        this.user = user;
    }
    
    @FXML
    public void accion_Regresar(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_superAdministrador.fxml").openStream());
            FXML_superAdministradorController superAdm = (FXML_superAdministradorController)loader.getController();
            superAdm.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void accion_Salir(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @FXML
    private void accion_Administrador(ActionEvent event) throws IOException, SQLException {
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("Administrador.fxml").openStream());
            Administrador adm = (Administrador)loader.getController();
            adm.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void accion_Gerente(ActionEvent event) throws IOException, SQLException {
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("Gerente.fxml").openStream());
            Gerente gerente = (Gerente)loader.getController();
            gerente.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void accion_Vendedor(ActionEvent event) throws IOException, SQLException {
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("Vendedor.fxml").openStream());
            Vendedor vendedor = (Vendedor)loader.getController();
            vendedor.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
