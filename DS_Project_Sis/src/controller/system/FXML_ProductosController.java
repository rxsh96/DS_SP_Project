
package controller.system;

import controller.singleton.ConexionDB;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entidad.articulo.Producto;

public class FXML_ProductosController implements Initializable {

    @FXML private Button regresar;
    @FXML private TextField codigo_producto;
    @FXML private TextField modelo;
    @FXML private TextField nombre;
    @FXML private TextField precio;
    @FXML private Button crear;
    @FXML private Button consultar;
    @FXML private Button actualizar;
    @FXML private Button eliminar;
    PreparedStatement ps;
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void accionRegresar(ActionEvent event) throws IOException {
        Parent homepParent = FXMLLoader.load(getClass().getResource("/view/fachada/FXML_LogIn.fxml"));
        Scene scene =new Scene(homepParent);
        Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        mainstage.hide();
        mainstage.setScene(scene);
        mainstage.show();
    }

    @FXML
    private void accionCrear(ActionEvent event) {
        ConexionDB con = new ConexionDB();
        con.realizaConexion();
        Connection c = con.getConnection();
        
        String query = "INSERT INTO producto"
                + "(codigo_producto, nombre, modelo, precio) VALUES"
                + "(?,?,?,?)";
          try {
            Statement st = c.prepareStatement(query);
            ps = (PreparedStatement) c.prepareStatement(query);
            ps.setString(1, codigo_producto.getText());
            ps.setString(2, nombre.getText());
            ps.setString(3, modelo.getText());
            int numEntero = Integer.parseInt(precio.getText());
            ps.setInt(4, numEntero);
            ps.executeUpdate();
            System.out.println("datos ingresados con exito");
        } catch (SQLException ex) {
            Logger.getLogger(FXML_ProductosController.class.getName()).log(Level.SEVERE, null, ex);
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
    private void accionConsultar(ActionEvent event){
        ConexionDB con = new ConexionDB();
        con.realizaConexion();
        Connection c = con.getConnection();
        try {
            ResultSet result = c.createStatement().executeQuery("select * from producto");
            while(result.next()){
                datos.add(new Producto(result.getString("codigo_producto"),result.getString("nombre"),result.getString("modelo"),result.getInt("precio")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXML_ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
            codigotable.setCellValueFactory(new PropertyValueFactory<>(null));
            nombretable.setCellValueFactory(new PropertyValueFactory<>(null));
            modelotable.setCellValueFactory(new PropertyValueFactory<>(null));
            preciotable.setCellValueFactory(new PropertyValueFactory<>(null));
            codigotable.setCellValueFactory(new PropertyValueFactory<>("codigo"));
            nombretable.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            modelotable.setCellValueFactory(new PropertyValueFactory<>("modelo"));
            preciotable.setCellValueFactory(new PropertyValueFactory<>("precio"));
            table.setItems(datos);
    }
static String tempproducto; 

    @FXML
    private void accionActualizar(ActionEvent event) throws SQLException {
        ConexionDB con = new ConexionDB();
        con.realizaConexion();
        Connection c = con.getConnection();
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
            Logger.getLogger(FXML_ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void accionEliminar(ActionEvent event) {
        ConexionDB con = new ConexionDB();
        con.realizaConexion();
        Connection c = con.getConnection();
        String query = "delete codigo_producto=?, nombre=?, modelo=?, precio=? from producto where nombre='"+tempproducto+"'";
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
            Logger.getLogger(FXML_ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void showOnTable(){
        ConexionDB con = new ConexionDB();
        con.realizaConexion();
        Connection c = con.getConnection();
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
            Logger.getLogger(FXML_ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
