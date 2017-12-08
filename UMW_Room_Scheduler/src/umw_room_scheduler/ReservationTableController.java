/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Joe
 */
public class ReservationTableController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //Configure what table does
    // Configure Tableview
    @FXML private TableView<Reservation> resTable = new TableView<>();
    @FXML private TableColumn<Reservation, SimpleStringProperty> userColumn;
    @FXML private TableColumn<Reservation, Boolean> avColumn;
    @FXML private TableColumn<Reservation, SimpleStringProperty> roomColumn;
    @FXML private TableColumn<Reservation, LocalDate> dateColumn;
    @FXML private TableColumn<Reservation, Integer> startTimeColumn;
    @FXML private TableColumn<Reservation, Integer> endTimeColumn;
    @FXML private DatePicker dp;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    userColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
    roomColumn.setCellValueFactory(new PropertyValueFactory<>("Room"));
    startTimeColumn.setCellValueFactory(new PropertyValueFactory<>("startTime"));
    endTimeColumn.setCellValueFactory(new PropertyValueFactory<>("endTime"));
    dateColumn.setCellValueFactory(new PropertyValueFactory<>("theDate"));
    avColumn.setCellValueFactory(new PropertyValueFactory<>("Equip"));
    resTable.setItems(getReservations());
    }    

    public ObservableList<Reservation> getReservations() {
  
      ObservableList<Reservation> reservations = FXCollections.observableArrayList();
//      Room rm1 = new Room("114","Trinkle",true);
//LocalDate day1 = LocalDate.of(1995, Month.MARCH, 12);
//Reservation r1 = new Reservation("jcee",rm1,false,day1,"8","11");
//reservations.add(new Reservation("jcd",rm1,true,LocalDate.of(1994, Month.MARCH, 12),900,1000));
//ObservableList<Reservation> reservations = FXCollections.observableArrayList(r1);
      
      return reservations;
}

}
    

