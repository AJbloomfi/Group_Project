package umw_room_scheduler;


/**
 * @Author Aaron Bloomfield
 */
//User class
public class User {
    protected String UserName;
    public boolean isAdmin;
    
    public User(){
    
    
    }
    
    public User(String name, boolean admin){
        UserName = name;
        isAdmin = admin;
    }
    
    public String getUserName(){
        return UserName;
    }
}



//Registered user class

//Admin user class


