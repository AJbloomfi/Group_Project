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
 *
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
    public Reservation( String name, String rmName,boolean equip, LocalDate d,String sT,String eT){
//     this.roomString = rom.getRoomName();
     this.UserName1 = new SimpleStringProperty(name);
     this.RoomNames = new SimpleStringProperty(rmName);
        d = date1;
      this.startTime = new SimpleStringProperty(sT);
      this.endTime = new SimpleStringProperty(eT);
        equip = isEquip1;
        
    }

    public void setUserName1(String UserName1) {
        this.UserName1 = new SimpleStringProperty(UserName1);
    }

    public void setRom(Room rom) {
        this.rom = rom;
    }

    public void setDate1(LocalDate date1) {
        this.date1 = date1;
    }

    public void setStartTime(String startTime) {
        this.startTime = new SimpleStringProperty(startTime);
       
    }

    public void setRoomNames(String RoomNames) {
        this.RoomNames = new SimpleStringProperty(RoomNames);
        
    }

    public void setEndTime(String endTime) {
        this.endTime = new SimpleStringProperty(endTime);
      
    }

    public void setIsEquip1(boolean isEquip1) {
        this.isEquip1 = isEquip1;
    }
   public String getRoomNames() {
        return RoomNames.get();
    }
    public String getUserName1() {
        return UserName1.get();
    }

    public Room getRom() {
        return rom;
    }

    public LocalDate getBirthday() {
        return date1;
    }

    public String getStartTime() {
        return startTime.get();
    }

    public String getEndTime() {
        return endTime.get();
    }

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
