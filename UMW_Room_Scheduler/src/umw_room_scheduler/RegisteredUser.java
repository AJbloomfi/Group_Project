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
    protected boolean isAdmin;
    
    /**
     *
     * @param name
     * @param BannerID
     */
    public RegisteredUser(String name){
        super(name);
//        UserName = name;
//        
    }
    public void setIsAdmin(boolean admin){
        admin = false;
        isAdmin = admin;
    }
    
}
