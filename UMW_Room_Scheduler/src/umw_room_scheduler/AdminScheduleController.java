/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class AdminScheduleController implements Initializable {
@FXML TableView<Reservation> makeResTable = new TableView<>();
    @FXML private TableColumn<Reservation, String> userColumn;
    @FXML private TableColumn<Reservation, String> roomColumn;
    @FXML private TableColumn<Reservation, LocalDate> dateColumn;
    @FXML private TableColumn<Reservation, String> startTimeColumn;
    @FXML private TableColumn<Reservation, String> endTimeColumn;
    @FXML private TableColumn<Reservation, Boolean> equipColumn;      
    @FXML ComboBox<Room> roomComboBox = new ComboBox<Room>();
    @FXML ComboBox<String> startTimeComboBox = new ComboBox<>();
    @FXML ComboBox<String> endTimeComboBox = new ComboBox<>();
    @FXML private TextField usernameTextField;
    @FXML private DatePicker reservationDate;
   
    public void userNameCellEvent(CellEditEvent edittedCell)
    {
        Reservation personSelected =  makeResTable.getSelectionModel().getSelectedItem();
        personSelected.setUserName1(edittedCell.getNewValue().toString());
    }
     public void roomNameCellEvent(CellEditEvent edittedCell)
    {
        Reservation reservationSelected =  makeResTable.getSelectionModel().getSelectedItem();
        reservationSelected.setRoomNames(edittedCell.getNewValue().toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        userColumn.setCellValueFactory(new PropertyValueFactory<>("UserName1"));
        roomColumn.setCellValueFactory(new PropertyValueFactory<>("Rom"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("Birthday"));
        startTimeColumn.setCellValueFactory(new PropertyValueFactory<>("StartTime"));
        endTimeColumn.setCellValueFactory(new PropertyValueFactory<>("EndTime"));
        equipColumn.setCellValueFactory(new PropertyValueFactory<>("Equip1"));
//        dateColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Reservation, LocalDate>, ObservableValue<LocalDate>>() {
//
//    @Override
//    public ObservableValue<LocalDate> call(TableColumn.CellDataFeatures<Reservation ,LocalDate> param) {
//        return new SimpleObjectProperty<>(param.getValue().getDate1());
//
//    }
//
//    }); 
        makeResTable.setItems(getReservations());
        /*
        * Make Table editable
        */      
        makeResTable.setEditable(true);
        userColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        roomColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
        Room rm1 = new Room("111", "HCC", true);
        Room rm2 = new Room("221", "HCC", true);
        Room rm3 = new Room("311", "Combs", true);
        Room rm4 = new Room("211", "Pollard", true);
        Room rm5 = new Room("301", "Pollard", true);
        
        roomComboBox.getItems().addAll(rm1,rm2,rm3,rm4,rm5);
        startTimeComboBox.getItems().addAll("12AM","1AM","2AM","3AM","4AM","5AM","6AM","7AM","8AM","9AM","10AM","11AM","12PM","1PM","2PM","3PM","4PM","5PM","6PM","7PM","8PM","9PM","10PM","11PM");
        endTimeComboBox.getItems().addAll("12AM","1AM","2AM","3AM","4AM","5AM","6AM","7AM","8AM","9AM","10AM","11AM","12PM","1PM","2PM","3PM","4PM","5PM","6PM","7PM","8PM","9PM","10PM","11PM");

    }
    public void GoBacktoRegUser(ActionEvent event) throws IOException{
    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("Admin.fxml"));
                    Parent registerUserParent = loader.load();
                    Scene regUser = new Scene(registerUserParent);
                    Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window3.setScene(regUser);
                    window3.show();
    }
        public void newReservationButtonPushed() throws IOException{
   String readRoom;
   readRoom = roomComboBox.getValue().toString();
   String regExp = "\\s*(\\s|,)\\s*";
   String[] sValues = readRoom.split(regExp);
   Room rmRead = new Room(sValues[0],sValues[1],Boolean.parseBoolean(sValues[2]));
   LocalDate d1 = reservationDate.getValue();
   Reservation r1 = new Reservation();
//                                    usernameTextField.getText(),
//                                    rmRead.name,
//                                    rmRead.avEquip,
//                                    d1,
//                                    startTimeComboBox.getValue(),
//                                    endTimeComboBox.getValue()       
                                    
   r1.setUserName1(usernameTextField.getText());
   r1.setDate1(d1);
   r1.setRoomNames(rmRead.name);
   r1.setIsEquip1(true);
   r1.setStartTime(startTimeComboBox.getValue());
   r1.setEndTime(endTimeComboBox.getValue());
   
   makeResTable.getItems().add(r1);
   usernameTextField.clear();
          String fileName = "reservation.txt";
        File file = new File(fileName);
        Scanner read = new Scanner(file);
        /*
        while (read.hasNext()){
            String line = read.nextLine();
            String regExp = "\\s*(\\s|,)\\s*";
            String[] sValues = line.split(regExp);
            Reservation reserveList = new Reservation(sValues[0],sValues[1],Integer.parseInt(sValues[2]),sValues[3]);
            reserveArray.add(reserveList);
        }
        */
         
         try(FileWriter fw = new FileWriter("reservation.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)){
         out.println(r1.toString());
         }
   
   }
public ObservableList<Reservation> getReservations(){
ObservableList<Reservation> resList = FXCollections.observableArrayList();

Reservation r1 = new Reservation("jcheeks","Hcc",true,LocalDate.of(1997, Month.MARCH, 12),"12am","1pm");
resList.add(r1);
return resList;
}    

    
}