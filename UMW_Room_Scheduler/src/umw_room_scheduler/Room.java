package umw_room_scheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*@Author Jazeb Raja
*/

public class Room {
    String roomNum;
    boolean avEquip;
    String name;
    Room r;
    
    public Room(){
    
    }
    public Room(String num, String build, boolean av){
        roomNum = num;
        avEquip = av;
        name = build;
    }
    public String getRoomNum(){
        return roomNum;
    }
    public boolean getAVEquip(){
        return avEquip;
    }
    public String getRoomName(){
        return name;
    }
    
    public String getAllRooms() throws FileNotFoundException{
    ArrayList<Room>roomArray = null;
        
        String fileName = "reservation.txt";
        File file = new File(fileName);
        try{
            
           roomArray = new ArrayList<>();
          
        
            Scanner read = new Scanner(file);
            while (read.hasNext()){
                String line = read.nextLine();
                String regExp = "\\s*(\\s|,)\\s*";
                String[] sValues = line.split(regExp);
                Room rm = new Room(sValues[0],sValues[1],Boolean.parseBoolean(sValues[2]));
                roomArray.add(rm);
}
  }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        
}

 return roomArray.toString();   
    }        
//    public String getBuilding(){
//    return roomBuilding;
//    }
    @Override
    
    public String toString(){
     String s = roomNum + " " + name +" " + avEquip;
     return s;
    }
}      
