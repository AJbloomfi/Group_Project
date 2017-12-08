/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
     * @throws java.io.IOException
     */
@FXML TextField loginTextField;
@FXML Label errMessage;

public void viewAsGuest(ActionEvent event) throws IOException
{
    Parent GuestViewParent = FXMLLoader.load(getClass().getResource("GuestSchedule.fxml"));
    Scene GuestView = new Scene(GuestViewParent);
    Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
    window2.setScene(GuestView);

}

    /**
     *
     * @param event
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NullPointerException
     */

    public void LoginAction(ActionEvent event) throws FileNotFoundException, IOException{
        ArrayList<RegisteredUser>users = new ArrayList<>();
        
        String fileName = "registeredusers.txt";
        File file = new File(fileName);
        Scanner read = new Scanner(file);
        
        while (read.hasNext()){
            String line = read.nextLine();
            String regExp = "\\s*(\\s|,)\\s*";
            String[] sValues = line.split(regExp);
            RegisteredUser user = new RegisteredUser(sValues[0],Boolean.parseBoolean(sValues[1]));
            users.add(user);
            
            
            for (RegisteredUser u : users) {
                if(u.getID().contains(loginTextField.getText()) && u.isAdmin==true)
                {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("Admin.fxml"));
                    Parent registerUserParent = loader.load();
                    Scene regUser = new Scene(registerUserParent);
                    Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window3.setScene(regUser);
                    window3.show();
                }
                if(u.getID().contains(loginTextField.getText())){
                     FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("RegisteredUserScreen.fxml"));
                    Parent registerUserParent = loader.load();
                    Scene regUser = new Scene(registerUserParent);
                    Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window3.setScene(regUser);
                    window3.show();
                
                }
                else{
                    
                    errMessage.setText("Incorrect Username");
                    errMessage.setVisible(true);
                } 
            }
        }
        

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
        errMessage.setVisible(false);
    }    
    
}
