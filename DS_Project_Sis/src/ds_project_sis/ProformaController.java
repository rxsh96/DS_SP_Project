/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rxsh96
 */
public class ProformaController implements Initializable {

    @FXML
    private TextField cedula;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private TextField direccion;
    @FXML
    private TextField id_venta;
    @FXML
    private DatePicker fecha_venta;
    @FXML
    private TextField producto_venta;
    @FXML
    private TextField precio_venta;
    @FXML
    private SplitMenuButton metodo_pago;
    @FXML
    private Button vender;
    @FXML
    private Button regresar;
    @FXML
    private Button salir;
    @FXML
    private TextField telefono;

    private Connection c;
    private String user;
    
    public void load(Connection c, String user) throws SQLException{
        this.c = c;
        this.user = user;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accion_Regresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("FXML_Vendedor.fxml").openStream());
            FXML_VendedorController vendedor = (FXML_VendedorController)loader.getController();
            vendedor.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(ProformaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void accion_Salir(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML_LogIn.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ProformaController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
}
