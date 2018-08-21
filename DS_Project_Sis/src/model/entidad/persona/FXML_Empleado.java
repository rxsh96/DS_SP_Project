
package model.entidad.persona;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.chainOfResponsibility.IAtencion;
import model.decorator.EmpleadoInterface;
import model.entidad.observer.Notificante;
import model.strategy.FormaPago;

public class FXML_Empleado implements Initializable, EmpleadoInterface, IAtencion {

    @FXML private Button regresar;
    @FXML private Button productos;
    @FXML private Button ventas;
    @FXML private Button clientes;
    @FXML private Button proformas;
    
    @FXML private void accionProductos(ActionEvent event) throws IOException{
        Parent homepParent = FXMLLoader.load(getClass().getResource("/view/fachada/FXML_LogIn.fxml"));
        Scene scene =new Scene(homepParent);
        Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        mainstage.hide();
        mainstage.setScene(scene);
        mainstage.show();
    }
    
    @FXML private void accionVentas(ActionEvent event) throws IOException{
        Parent homepParent = FXMLLoader.load(getClass().getResource("/view/fachada/FXML_LogIn.fxml"));
        Scene scene =new Scene(homepParent);
        Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        mainstage.hide();
        mainstage.setScene(scene);
        mainstage.show();
    }

    @FXML private void accionClientes(ActionEvent event) throws IOException{
        Parent homepParent = FXMLLoader.load(getClass().getResource("/view/fachada/FXML_LogIn.fxml"));
        Scene scene =new Scene(homepParent);
        Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        mainstage.hide();
        mainstage.setScene(scene);
        mainstage.show();
    }
    
    @FXML private void accionProformas(ActionEvent event) throws IOException{
        Parent homepParent = FXMLLoader.load(getClass().getResource("/view/fachada/FXML_LogIn.fxml"));
        Scene scene =new Scene(homepParent);
        Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        mainstage.hide();
        mainstage.setScene(scene);
        mainstage.show();
    }
   
    @FXML private void accionRegresar(ActionEvent event) throws IOException{
        Parent homepParent = FXMLLoader.load(getClass().getResource("/view/fachada/FXML_LogIn.fxml"));
        Scene scene =new Scene(homepParent);
        Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        mainstage.hide();
        mainstage.setScene(scene);
        mainstage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    protected FXML_Empleado empleado;
    private Notificante notificante;
    private FormaPago formaPago;


    public void consultarProducto() {
        // TODO implement here
    }

    public void consultarCliente() {

    }

    public void crearCliente() {

    }

    public void vender() {
        // TODO implement here

    }

    public void realizarProforma() {

    }

    public void editarDatosFactura() {

    }

    public void editarVenta() {

    }

    /**
     * @param atencion 
     * @return
     */


    /**
     * @param empleado
     */
    @Override
    public void atender(FXML_Empleado empleado) {
        // TODO implement here

    }

    public void notificarPeticion() {
        // TODO implement here
    }

    @Override
    public void solicitarPermiso() {

    }

    @Override
    public void setNext(IAtencion atencion) {

    }

    @Override
    public IAtencion getNext() {
        return null;
    }
    
}
