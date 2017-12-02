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
public class AdminUser extends User{
//    protected boolean isAdmin;
//    protected String name;
    
    public AdminUser(String name, boolean admin){
        this.UserName = name;
        isAdmin = admin;
        admin = true;
    }
    
    public String getID(){
        return UserName;
    }
    public void RemoveUser(){
        
    }
}
