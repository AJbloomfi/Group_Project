package umw_room_scheduler;
/**
*@Author Jazeb Raja
*/

public class Room {
    private String roomNum;
    private boolean avEquip;
    private String roomBuilding;
    
    
    public Room(){
    
    }
    public Room(String num, String build, boolean av){
        roomNum = num;
        avEquip = av;
        roomBuilding = build;
    }
    public String getRoomNum(){
        return roomNum;
    }
    public boolean getAVEquip(){
        return avEquip;
    }
    public String getRoomBuilding(){
        return roomBuilding;
    }
}
