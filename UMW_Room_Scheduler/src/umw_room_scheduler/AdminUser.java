/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
    public boolean getAdmin(){
        return isAdmin;
    }
    public void RemoveUser() throws IOException{
        ArrayList<RegisteredUser>registerArray = null;
        registerArray = new ArrayList<>();
        Scanner read = new Scanner("registeredusers.txt");
        while (read.hasNext()){
            String line = read.nextLine();
            String regExp = "\\s*(\\s|,)\\s*";
            String[] sValues = line.split(regExp);
            sValues[0] = UserName;
            //Boolean.parseBoolean(sValues[1]) = isAdmin;
            RegisteredUser userList = new RegisteredUser(sValues[0],Boolean.parseBoolean(sValues[1]));
            
            registerArray.add(userList);
        }
        System.out.println("Which user would you like to remove?");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        if(username.equals(UserName)){
            registerArray.remove(input);
            PrintWriter out = new PrintWriter(new FileWriter("registeredusers.txt"));
            for(int s = 0; s<registerArray.size(); s++){ //loop through the list
            out.println(registerArray.get(s).getID() + " " + registerArray.get(s).getAdmin());
            out.close();
        }
    }
}
}

