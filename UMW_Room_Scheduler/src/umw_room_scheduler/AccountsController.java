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
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class AccountsController implements Initializable {
@FXML TableView<RegisteredUser> TableView = new TableView<>();
    @FXML private TableColumn<RegisteredUser, String> userColumn;
    @FXML private TableColumn<RegisteredUser, String> isAdminColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        userColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        isAdminColumn.setCellValueFactory(new PropertyValueFactory<>("Admin"));
        TableView.setEditable(true);
        userColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    try {
        TableView.setItems(getUsers());
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AccountsController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void userCellEvent(TableColumn.CellEditEvent edittedCell)
    {
        RegisteredUser personSelected =  TableView.getSelectionModel().getSelectedItem();
        personSelected.setUserName(edittedCell.getNewValue().toString());
    }
//     public void adminCellEvent(TableColumn.CellEditEvent edittedCell)
//    {
//        RegisteredUser reservationSelected =  TableView.getSelectionModel().getSelectedItem();
//        reservationSelected.setIsAdmin(edittedCell.);
//    } 

public ObservableList<RegisteredUser> getUsers() throws FileNotFoundException{
       ArrayList<RegisteredUser> userArray = new ArrayList<>();
        String fileName = "registeredusers.txt";
        File file = new File(fileName);
        Scanner read = new Scanner(file);
       
        while (read.hasNext()){
            String line = read.nextLine();
            String regExp = "\\s*(\\s|,)\\s*";
            String[] sValues = line.split(regExp);
           RegisteredUser userList = new RegisteredUser(sValues[0],Boolean.parseBoolean(sValues[1]));
            userArray.add(userList);
        }
    ObservableList<RegisteredUser> resList = FXCollections.observableArrayList(userArray);


return resList;
}
    public void BackAction2(ActionEvent event) throws IOException{
 FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("Admin.fxml"));
                    Parent registerUserParent = loader.load();
                    Scene regUser = new Scene(registerUserParent);
                    Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window3.setScene(regUser);
                    window3.show();
}
}
