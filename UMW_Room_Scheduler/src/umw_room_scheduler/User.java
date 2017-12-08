package umw_room_scheduler;

import javafx.beans.property.SimpleStringProperty;


/**
 * @Author Aaron Bloomfield
 * 
 */
//User class
public class User {
    /**
     * Initializes the paramter for the User class.
     */
    protected SimpleStringProperty UserName;
    public boolean isAdmin;
    
    public User(){
    
    
    }
    /**
     * Default constructor to initialize a user.
     * @param name
     * @param admin 
     */
    
    public User(String name, boolean admin){
        this.UserName = new SimpleStringProperty(name);
        isAdmin = admin;
    }
    /**
     * Method to return the username of a user.
     * @return 
     */
    
public String getID(){
        return UserName.get();
    }
/**
 * Method to return whether the user is an administrator.
 * @return 
 */
    public boolean getAdmin(){
        return isAdmin;
    }
}



//Registered user class

//Admin user class


