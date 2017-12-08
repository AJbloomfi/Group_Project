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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class RegisteredUserScreenController implements Initializable {

    /**
     * Initializes the controller class.
     * @param event
     * @throws java.io.IOException
     */
    public void ViewScheduleAction(ActionEvent event) throws IOException{

//    
    }
     public void BacktoHomeAction(ActionEvent event) throws IOException{
       Parent registerFormParent = FXMLLoader.load(getClass().getResource("FXMLlogin.fxml"));
    Scene registerScene = new Scene(registerFormParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(registerScene);
     }
    public void MakeReservationAction(ActionEvent event) throws IOException{
    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("MakeReservation.fxml"));
                    Parent registerUserParent = loader.load();
                    Scene regUser = new Scene(registerUserParent);
                    Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window3.setScene(regUser);
                    window3.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
