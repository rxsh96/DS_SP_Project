
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

public class FXML_AdministradorController implements Initializable {
    
    @FXML private Button salir;
    @FXML private Button productos;
    @FXML private Button ventas;
    
    private Connection c;
    private String user;
    
    public void load(Connection c, String user) throws SQLException{
        this.c = c;
        this.user = user;
    }
    
    @FXML
    public void accion_Producto(ActionEvent event) throws SQLException{
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_Producto.fxml").openStream());
            FXML_ProductoController producto = (FXML_ProductoController)loader.getController();
            producto.load(c, "Administrador");
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(FXML_AdministradorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void accion_Venta(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("Venta.fxml").openStream());
            VentaController venta = (VentaController)loader.getController();
            venta.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(FXML_AdministradorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void accion_Salir(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML_LogIn.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXML_AdministradorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
