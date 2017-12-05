/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class RegisterUserFormController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML TextField userNameEntered;
    /*Creates a new registered user*/
    public void registerUserAction(ActionEvent event) throws FileNotFoundException{
        PrintWriter fw = null;
            fw = new PrintWriter("registeredusers.txt");
            BufferedWriter bw = new BufferedWriter(fw);
   
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
