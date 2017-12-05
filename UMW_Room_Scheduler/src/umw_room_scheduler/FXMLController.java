/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     *  
     * @param event
     */
    @FXML TextField username;
    public void handleLoginAction(ActionEvent event){
   
   
    
    
    }
    public void RegisterAction(ActionEvent event) throws IOException{
    Parent registerFormParent = FXMLLoader.load(getClass().getResource("registerUserForm.fxml"));
    Scene registerScene = new Scene(registerFormParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(registerScene);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
