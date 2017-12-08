/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class GuestScheduleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    /*
    *Create Table for View SChedule
    */
   @FXML private TableView<Reservation> guestView = new TableView<>();
   @FXML private TableColumn<Reservation, String> userColumn;
    @FXML private TableColumn<Reservation, String> roomColumn;
    @FXML private TableColumn<Reservation, LocalDate> dateColumn;
    @FXML private TableColumn<Reservation, String> startTimeColumn;
    @FXML private TableColumn<Reservation, String> endTimeColumn;
    @FXML private TableColumn<Reservation, Boolean> equipColumn;
    DatePicker dp;
    
    public void BacktoHomeAction(ActionEvent event) throws IOException{
       Parent registerFormParent = FXMLLoader.load(getClass().getResource("FXMLlogin.fxml"));
    Scene registerScene = new Scene(registerFormParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(registerScene);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    userColumn.setCellValueFactory(new PropertyValueFactory<>("UserName1"));
    roomColumn.setCellValueFactory(new PropertyValueFactory<>("Room"));
//    roomColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Reservation, String>, ObservableValue<String>>() {
//
//    @Override
//    public ObservableValue<String> call(TableColumn.CellDataFeatures<Reservation , String> param) {
//        return new SimpleObjectProperty<>(param.getValue().getReservationRoomName());
//
//    }
//
//    });
//    userColumn.setCellValueFactory(new PropertyValueFactory<>("RoomName"));
    startTimeColumn.setCellValueFactory(new PropertyValueFactory<>("Start"));
//    startTimeColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Reservation, String>, ObservableValue<String>>() {
//
//    @Override
//    public ObservableValue<String> call(TableColumn.CellDataFeatures<Reservation , String> param) {
//        return new SimpleObjectProperty<>(param.getValue().getStart());
//
//    }
//
//    });
//    endTimeColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Reservation, String>, ObservableValue<String>>() {
//
//    @Override
//    public ObservableValue<String> call(TableColumn.CellDataFeatures<Reservation ,String> param) {
//        return new SimpleObjectProperty<>(param.getValue().getEnd());
//
//    }
//
//    });
   // roomColumn.setCellValueFactory(new PropertyValueFactory<>("Room"));
    endTimeColumn.setCellValueFactory(new PropertyValueFactory<>("End"));
//    dateColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
    dateColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Reservation, LocalDate>, ObservableValue<LocalDate>>() {

    @Override
    public ObservableValue<LocalDate> call(TableColumn.CellDataFeatures<Reservation ,LocalDate> param) {
        return new SimpleObjectProperty<>(param.getValue().getBirthday());

    }

    });    
    equipColumn.setCellValueFactory(new PropertyValueFactory<>("Equip"));
    
       try {
           guestView.setItems(getReservations());
           
          // guestView.getColumns().addAll(userColumn, roomColumn, dateColumn, startTimeColumn, endTimeColumn, equipColumn);
       } catch (FileNotFoundException ex) {
           Logger.getLogger(GuestScheduleController.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
public ObservableList<Reservation> getReservations() throws FileNotFoundException{
Lists ls = new Lists();

//ObservableList<Reservation> reservations = FXCollections.observableArrayList();
//reservations.add(ls.getReservationslist());
Room rm1 = new Room("114","Trinkle",true);
LocalDate day1 = LocalDate.of(1995, Month.MARCH, 12);
Reservation r1 = new Reservation();
r1.setUserName1("Aaron");
r1.setDate1(day1);
r1.setIsEquip1(true);
r1.setStartTime("2pm");
r1.setEndTime("4pm");
r1.setRoomNames("111 HCC");
//reservations.add(new Reservation("jcd",rm1,true,LocalDate.of(1994, Month.MARCH, 12),900,1000));
ObservableList<Reservation> reservations = FXCollections.observableArrayList(r1);
guestView.getItems().add(r1);

return reservations;
}    
    
}
