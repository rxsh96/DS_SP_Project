
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

public class FXML_Gerente extends Persona implements Initializable {
    
    @FXML private Button regresar;
    @FXML private Button consultas;
    @FXML private Button reportes;
    
    @FXML
    private void accionConsulta(ActionEvent event) throws IOException{
        Parent homepParent = FXMLLoader.load(getClass().getResource("/view/fachada/FXML_LogIn.fxml"));
        Scene scene =new Scene(homepParent);
        Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        mainstage.hide();
        mainstage.setScene(scene);
        mainstage.show();
    }
    
    @FXML
    private void accionReporte(ActionEvent event) throws IOException{
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
    
        /**
     * Default constructor
     */
    public FXML_Gerente() {
    }

    /**
     * @param nombre
     */
    public void Gerente(String nombre) {
        // TODO implement here
    }

    public void consultarCliente() {
        // TODO implement here
    }

    public void consultarEmpleado() {

    }

    public void consultarProducto() {
        // TODO implement here

    }

    public void consultarVentas() {
        // TODO implement here

    }

    public void consultarReporte() {

    }
    
}
