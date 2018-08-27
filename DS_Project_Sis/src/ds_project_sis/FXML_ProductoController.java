
package ds_project_sis;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FXML_ProductoController implements Initializable {

    @FXML private Button salir;
    @FXML private Button regresar;
    @FXML private TextField codigo_producto;
    @FXML private TextField modelo;
    @FXML private TextField nombre;
    @FXML private TextField precio;
    @FXML private Button crear;
    @FXML private Button consultar;
    @FXML private Button actualizar;
    @FXML private Button eliminar;
    
    private PreparedStatement ps;
    private static String tempproducto;
    
    @FXML
    private TableView<Producto> table;
    @FXML
    private TableColumn<Producto, String> codigotable;
    @FXML
    private TableColumn<Producto, String> nombretable;
    @FXML
    private TableColumn<Producto, String> modelotable;
    @FXML
    private TableColumn<Producto, Integer> preciotable;

    ObservableList<Producto> datos = FXCollections.observableArrayList();
    
    private Connection c;
    private String user;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    public void load(Connection c, String user){
        this.c = c;
        this.user = user;
    }
    
    @FXML private void accion_Salir(ActionEvent event) throws IOException{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML_LogIn.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXML_ProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML private void accion_Regresar(ActionEvent event) throws IOException, SQLException{
        try {
                FXMLLoader loader = new FXMLLoader();
                ScrollPane root;
                if(user.equalsIgnoreCase("Administrador")){
                    root = (ScrollPane)loader.load(getClass().getResource("FXML_Administrador.fxml").openStream());    
                    FXML_AdministradorController adm = (FXML_AdministradorController)loader.getController();
                    adm.load(c, user);
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
                Logger.getLogger(FXML_ProductoController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    @FXML
    private void accion_Crear(ActionEvent event) throws SQLException {
        String query = "INSERT INTO producto"
                + "(codigo_producto, nombre, modelo, precio) VALUES"
                + "(?,?,?,?)";
          try {
            Statement st = c.prepareStatement(query);
            ps = (PreparedStatement) c.prepareStatement(query);
            ps.setString(1, codigo_producto.getText());
            ps.setString(2, nombre.getText());
            ps.setString(3, modelo.getText());
            double numEntero = Double.parseDouble(precio.getText());
            ps.setDouble(4, numEntero);
            ps.executeUpdate();
            System.out.println("Datos ingresados con exito");
        } catch (SQLException ex) {
            Logger.getLogger(FXML_ProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }
    }

    @FXML
    private void accion_Consultar(ActionEvent event){

        try {
            ResultSet result = c.createStatement().executeQuery("select * from producto");
            while(result.next()){
                datos.add(new Producto(result.getString("codigo_producto"),result.getString("nombre"),result.getString("modelo"),result.getInt("precio")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXML_ProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
            codigotable.setCellValueFactory(new PropertyValueFactory<>("codigo"));
            nombretable.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            modelotable.setCellValueFactory(new PropertyValueFactory<>("modelo"));
            preciotable.setCellValueFactory(new PropertyValueFactory<>("precio"));
            table.setItems(datos);
    }
 

    @FXML
    private void accion_Actualizar(ActionEvent event) throws SQLException {

        String query = "update producto set codigo_producto=?, nombre=?, modelo=?, precio=? where nombre='"+tempproducto+"'";
        try{
            ps = (PreparedStatement) c.prepareStatement(query);
            ps.setString(1, codigo_producto.getText());
            ps.setString(2, nombre.getText());
            ps.setString(3, modelo.getText());
            int numEntero = Integer.parseInt(precio.getText());
            ps.setInt(4, numEntero);
            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
            Logger.getLogger(FXML_ProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void accion_Eliminar(ActionEvent event) {

        String query = "delete * from producto where nombre='"+tempproducto+"'";
        try{
            ps = (PreparedStatement) c.prepareStatement(query);
            ps.setString(1, codigo_producto.getText());
            ps.setString(2, nombre.getText());
            ps.setString(3, modelo.getText());
            int numEntero = Integer.parseInt(precio.getText());
            ps.setInt(4, numEntero);
            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
            Logger.getLogger(FXML_ProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void showOnTable(){

        try{
            Producto prod = (Producto)table.getSelectionModel().getSelectedItem();
            String query = "select * from producto";
            ps = (PreparedStatement) c.prepareStatement(query);
            
            tempproducto = prod.getNombre();
            codigo_producto.setText(prod.getCodigo());
            nombre.setText(prod.getNombre());
            modelo.setText(prod.getModelo());
            int numEntero = prod.getPrecio();
            String numString = numEntero+"";
            precio.setText(numString);
            ps.close();
            c.close();
        }
        catch(SQLException ex){
            Logger.getLogger(FXML_ProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
