
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

public class FXML_VendedorController implements Initializable {

    @FXML private Button regresar;
    @FXML private Button productos;
    @FXML private Button ventas;
    @FXML private Button clientes;
    @FXML private Button proformas;
    
    private Connection c;
    private String user;
    
    public void load(Connection c, String user){
        this.c = c;
        this.user = user;
    }
    
    @FXML
    private void accion_Productos(ActionEvent event) throws IOException{
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_Producto.fxml").openStream());
            FXML_ProductoController producto = (FXML_ProductoController)loader.getController();
            producto.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(FXML_VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void accion_Ventas(ActionEvent event) throws IOException{
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
            Logger.getLogger(FXML_VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void accion_Clientes(ActionEvent event) throws IOException{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML_LogIn.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXML_VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void accion_Proformas(ActionEvent event) throws IOException, SQLException{
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("Proforma.fxml").openStream());
            ProformaController proforma = (ProformaController)loader.getController();
            proforma.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(FXML_VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @FXML private void accion_Regresar(ActionEvent event) throws IOException{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML_LogIn.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXML_VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
