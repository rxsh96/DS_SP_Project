
package view.fachada;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXML_LogInController implements Initializable {

    @FXML private TextField user;
    @FXML private PasswordField pass;
    @FXML private Button ingresar_login;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML private void accionIngresar(ActionEvent event) throws IOException{
        String us = user.getText();
        String pas = pass.getText();   

        if (us.equals("Administrador") && pas.equals("pass")){
            Parent homepParent = FXMLLoader.load(getClass().getResource("/view/FXML_Administrador.fxml"));
            Scene scene =new Scene(homepParent);
            Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            mainstage.hide();
            mainstage.setScene(scene);
            mainstage.show();
        }
        else if (us.equals("Super") && pas.equals("pass")){
            Parent homepParent = FXMLLoader.load(getClass().getResource("/view/FXML_superAdministrador.fxml"));
            Scene scene =new Scene(homepParent);
            Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            mainstage.hide();
            mainstage.setScene(scene);
            mainstage.show();
        }
        else if (us.equals("Gerente") && pas.equals("pass")){
            Parent homepParent = FXMLLoader.load(getClass().getResource("/view/FXML_Gerente.fxml"));
            Scene scene =new Scene(homepParent);
            Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            mainstage.hide();
            mainstage.setScene(scene);
            mainstage.show();
        }
        else if (us.equals("Vendedor") && pas.equals("pass")){
            Parent homepParent = FXMLLoader.load(getClass().getResource("/view/FXML_Vendedor.fxml"));
            Scene scene =new Scene(homepParent);
            Stage mainstage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            mainstage.hide();
            mainstage.setScene(scene);
            mainstage.show();
        }
        else{
            // muestra un cuadro de diálogo joptionpane usando showMessageDialog
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta, porfavor vuelva a introducir los datos.");
            user.setText(null);
            pass.setText(null);
        }
    }  
}
