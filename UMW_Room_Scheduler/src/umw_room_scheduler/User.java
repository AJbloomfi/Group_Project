package umw_room_scheduler;

import javafx.beans.property.SimpleStringProperty;


/**
 * @Author Aaron Bloomfield
 */
//User class
public class User {
    protected SimpleStringProperty UserName;
    public boolean isAdmin;
    
    public User(){
    
    
    }
    
    public User(String name, boolean admin){
        this.UserName = new SimpleStringProperty(name);
        isAdmin = admin;
    }
    
public String getID(){
        return UserName.get();
    }
    public boolean getAdmin(){
        return isAdmin;
    }
}



//Registered user class

//Admin user class


