
package controller.system;

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

public class FXML_VendedorController implements Initializable {

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
    
}
