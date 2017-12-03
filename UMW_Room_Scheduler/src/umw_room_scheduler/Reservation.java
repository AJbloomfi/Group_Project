/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

/**
 *
 * @author Joe
 */
public class Reservation {
    protected String UserName;
    private String roomNum;
    private boolean avEquip;
    private String roomBuilding;
    int date;

    
    public Reservation( String name, String number, boolean equip, String building, int d){
        name = UserName;
        number = roomNum;
        equip = avEquip;
        building = roomBuilding;
        d = date;
    }
        
      
}
