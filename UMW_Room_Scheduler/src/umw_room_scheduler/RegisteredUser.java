/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

/**
 *
 * @Author Aaron Bloomfield
 */
public class RegisteredUser extends User{
    
    /**
     *
     * @param name
     * @param BannerID
     */
    public RegisteredUser(String name, boolean admin){
        this.UserName = name;
        isAdmin = admin;
//        
    }
    public void AdminUser(String name, boolean admin){
        this.UserName = name;
        isAdmin = admin;
        admin = false;
    }
    public String getID(){
        return UserName;
    }
    public boolean getAdmin(){
        return isAdmin;
    }
}
    
