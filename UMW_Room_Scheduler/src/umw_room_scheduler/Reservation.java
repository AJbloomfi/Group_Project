/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.time.LocalDate;
import java.time.Month;
import javafx.beans.property.SimpleStringProperty;

/**
 *Initializes the parameters for a reservation class.
 * @author Joe
 */
public class Reservation {
    SimpleStringProperty UserName1;   
     Room rom;
   // private String roomString;
    
    LocalDate date1;
    SimpleStringProperty startTime;
    SimpleStringProperty RoomNames;
    
 
    SimpleStringProperty endTime;
    boolean isEquip1;
    
   
    public Reservation(){
    this.UserName1 = new SimpleStringProperty("");
    this.RoomNames = new SimpleStringProperty("");
    this.startTime = new SimpleStringProperty("");
    this.endTime = new SimpleStringProperty("");
    this.isEquip1 = true;
    this.date1 = LocalDate.of(2000, Month.MARCH, 12);
    
    }
    /**
     * Default constructor to initialize a reservation.
     * @param name
     * @param rmName
     * @param equip
     * @param d
     * @param sT
     * @param eT 
     */
    public Reservation( String name, String rmName,boolean equip, LocalDate d,String sT,String eT){
//     this.roomString = rom.getRoomName();
     this.UserName1 = new SimpleStringProperty(name);
     this.RoomNames = new SimpleStringProperty(rmName);
        d = date1;
      this.startTime = new SimpleStringProperty(sT);
      this.endTime = new SimpleStringProperty(eT);
        equip = isEquip1;
        
    }
    /**
     * Method to set a user name as a simple string property.
     * @param UserName1 
     */

    public void setUserName1(String UserName1) {
        this.UserName1 = new SimpleStringProperty(UserName1);
    }
    /**
     * Method to set the room.
     * @param rom 
     */

    public void setRom(Room rom) {
        this.rom = rom;
    }
    /**
     * Method to set the date
     * @param date1 
     */

    public void setDate1(LocalDate date1) {
        this.date1 = date1;
    }
    /**
     * Method to set the start time.
     * @param startTime 
     */

    public void setStartTime(String startTime) {
        this.startTime = new SimpleStringProperty(startTime);
       
    }
    /**
     * Method to set the room name.
     * @param RoomNames 
     */

    public void setRoomNames(String RoomNames) {
        this.RoomNames = new SimpleStringProperty(RoomNames);
        
    }
    /**
     * Method to set the end time.
     * @param endTime 
     */

    public void setEndTime(String endTime) {
        this.endTime = new SimpleStringProperty(endTime);
      
    }
    /**
     * Method to set whether a reservation has equipment.
     * @param isEquip1 
     */

    public void setIsEquip1(boolean isEquip1) {
        this.isEquip1 = isEquip1;
    }
    /**
     * Method to return the room names.
     * @return 
     */
   public String getRoomNames() {
        return RoomNames.get();
    }
   /**
    * Method to return the user name
    * @return 
    */
    public String getUserName1() {
        return UserName1.get();
    }
    /**
     * Method to return the room.
     * @return 
     */

    public Room getRom() {
        return rom;
    }
    /**
     * Method to return the birthday
     * @return 
     */

    public LocalDate getBirthday() {
        return date1;
    }
    /**
     * Method to return the start time.
     * @return 
     */

    public String getStartTime() {
        return startTime.get();
    }
    /**
     * Method to return the end time.
     * @return 
     */

    public String getEndTime() {
        return endTime.get();
    }
    /**
     * Method to return equipment.
     * @return 
     */

    public boolean isIsEquip1() {
        return isEquip1;
    }

    @Override
    public String toString(){
    String name ="";
    this.UserName1 = new SimpleStringProperty(name);
    String s = name;
    return s;
    }
      
}
