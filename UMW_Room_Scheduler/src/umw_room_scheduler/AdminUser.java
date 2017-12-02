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
public class AdminUser extends RegisteredUser{
    protected boolean isAdmin;
    
    public AdminUser(String name){
       super(name);
    }
    
    public String getID(){
        return UserName;
    }
    public void setIsAdmin(boolean admin){
        admin = true;
        isAdmin = admin;
    }
}
