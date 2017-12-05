/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    @FXML private TableColumn<Reservation, SimpleStringProperty> roomnumColumn;
    @FXML private TableColumn<Reservation, Boolean> avColumn;
    @FXML private TableColumn<Reservation, SimpleStringProperty> roomColumn;
    @FXML private TableColumn<Reservation, LocalDate> dateColumn;
    @FXML private TableColumn<Reservation, LocalTime> timeColumn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        /*
    userColumn.setCellFactory(new PropertyValueFactory<>("userName"));
    roomnumColumn.setCellFactory(new PropertyValueFactory<>("roomNum"));
    avColumn.setCellFactory(new PropertyValueFactory<>("isEquip"));
    roomColumn.setCellFactory(new PropertyValueFactory<>("building"));
    dateColumn.setCellFactory(new PropertyValueFactory<>("Date"));
    timeColumn.setCellFactory(new PropertyValueFactory<>("time"));
    
    resTable.setItems(getReservations());
    }    

    public ObservableList<Reservation> getReservations() {
      ObservableList<Reservation> reservations = FXCollections.observableArrayList();
      
      return reservations;
*/}

}
    

