
package ds_project_sis;

import controller.singleton.DBConector;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Administrador implements Initializable {

    @FXML
    private TextField cedula;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private TextField direccion;
    @FXML
    private Button crear;
    @FXML
    private Button salir;
    @FXML
    private TextField telefono;
    @FXML
    private Button actualizar;
    @FXML
    private Button atras;
    
    PreparedStatement ps;

    private Connection c;
    private String user;
    
    public void load(Connection c, String user) throws SQLException {
        this.c = c;
        this.user = user;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accion_Crear(ActionEvent event) throws SQLException {
        
        String query = "INSERT INTO empleado"
                + "(id_empleado, nombre, apellido, direccion, telefono) VALUES"
                + "(?,?,?,?,?)";
          try {
            Statement st = c.prepareStatement(query);
            ps = (PreparedStatement) c.prepareStatement(query);
            ps.setString(1, cedula.getText());
            ps.setString(2, nombre.getText());
            ps.setString(3, apellido.getText());
            ps.setString(4, direccion.getText());
            ps.setString(5, telefono.getText());
            ps.executeUpdate();
            System.out.println("datos ingresados con exito");
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void accion_Actualizar(ActionEvent event) {
        
    }
    
    @FXML
    public void accion_Regresar(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root = (ScrollPane)loader.load(getClass().getResource("Empleado.fxml").openStream());
            Empleado empleado = (Empleado)loader.getController();
            empleado.load(c, user);
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
