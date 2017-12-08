/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
 try(FileWriter fw = new FileWriter("registeredusers.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
        {

            out.println(userNameEntered.getText()+ " "+"false");
            
        }
        catch(IOException e){
        }
    }
  public void backToHomeAction(ActionEvent event) throws IOException{
  FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("FXMLlogin.fxml"));
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
