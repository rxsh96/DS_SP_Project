
package ds_project_sis;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
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

public class VentaController implements Initializable {

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
    private TextField telefono;
    @FXML
    private Button salir;
    
    private PreparedStatement ps;

    private Connection c;
    private String user;
  
    public void load(Connection c, String user) {
        this.c = c;
        this.user = user;
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accion_Vender(ActionEvent event) {
        
        String query = "INSERT INTO cliente"
                + "(cedula_cliente, nombre, apellido, direccion, telefono) VALUES"
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
            Logger.getLogger(VentaController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                c.close();
            } catch (SQLException e) {
//                e.printStackTrace();
            }    
        }
        
        String query2 = "INSERT INTO venta"
                + "(id_venta, fecha, producto, precio, cedula_cliente) VALUES"
                + "(?,?,?,?,?)";
          try {
            Statement st = c.prepareStatement(query2);
            ps = (PreparedStatement) c.prepareStatement(query2);
            ps.setString(1, id_venta.getText());
            Date fecha_actual = new Date();
            java.sql.Date fechasql=new java.sql.Date(fecha_actual.getTime());
            ps.setDate(2, fechasql);
            ps.setString(3, producto_venta.getText());
            int numEntero = Integer.parseInt(precio_venta.getText());
            ps.setInt(4, numEntero);
            ps.setString(5, cedula.getText());
            ps.executeUpdate();
            System.out.println("datos ingresados con exito");
        } catch (SQLException ex) {
            Logger.getLogger(VentaController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                c.close();
            } catch (SQLException e) {
//                e.printStackTrace();
            }    
        }
    }

    @FXML
    private void accion_Regresar(ActionEvent event) throws IOException, SQLException {
        try {
            FXMLLoader loader = new FXMLLoader();
            ScrollPane root; 
            if(user.equalsIgnoreCase("Administrador")){
                root = (ScrollPane)loader.load(getClass().getResource("FXML_Administrador.fxml").openStream());
                FXML_AdministradorController adm = (FXML_AdministradorController)loader.getController();
                adm.load(c, "Administrador");
            }
            else if(user.equalsIgnoreCase("Super Administrador")){
                    root = (ScrollPane)loader.load(getClass().getResource("FXML_superAdministrador.fxml").openStream());    
                    FXML_superAdministradorController superAdm = (FXML_superAdministradorController)loader.getController();
                    superAdm.load(c, user);
                }
            else{
                root = (ScrollPane)loader.load(getClass().getResource("FXML_Vendedor.fxml").openStream());    
                FXML_VendedorController vendedor = (FXML_VendedorController)loader.getController();
                vendedor.load(c, user);
            }
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(VentaController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(VentaController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
