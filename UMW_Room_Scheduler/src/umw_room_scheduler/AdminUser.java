/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @Author Aaron Bloomfield
 * This class creates an Administrative user
 */
public class AdminUser extends User{
//    protected boolean isAdmin;
//    protected String name;
    /**
     * The default constructor for creating an administrative user.
     * @param name
     * @param admin 
     */
    public AdminUser(String name, boolean admin){
        this.UserName = new SimpleStringProperty(name);
        isAdmin = admin;
        admin = true;
    }
    /**
     * Method to return the User name.
     * @return 
     */
    @Override
    public String getID(){
        return UserName.get();
    }
    /**
     * Method to return whether or not the admin is an admin.
     * @return 
     */
    public boolean getAdmin(){
        return isAdmin;
    }
    /**
     * Method that imports a a text file containing all registered users and then creates a loop that allows 
     * an administrative user to remove a registered user.
     * @throws IOException 
     */
    public void RemoveUser() throws IOException{
        ArrayList<RegisteredUser>registerArray = null;
        registerArray = new ArrayList<>();
        String fileName = "registeredusers.txt";
        File file = new File(fileName);
        Scanner read = new Scanner(file);
        while (read.hasNext()){
            String line = read.nextLine();
            String regExp = "\\s*(\\s|,)\\s*";
            String[] sValues = line.split(regExp);
            RegisteredUser userList = new RegisteredUser(sValues[0],Boolean.parseBoolean(sValues[1]));
            
            registerArray.add(userList);
        }
        System.out.println("Which user would you like to remove?");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        boolean flag = false;
        for (int i=0; i<registerArray.size(); i++){
            if(username.equals(registerArray.get(i).getID())){
                System.out.println("The user: ");
                String name = registerArray.get(i).getID();
                
                System.out.println(name);
                System.out.println("has been removed as a registered user.");
                registerArray.remove(i);
                flag = true;
                try(FileWriter fw = new FileWriter("registeredusers.txt",false);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw))
                {
                    for(int x=0; x<registerArray.size(); x++){
                        String Newname = registerArray.get(x).getID();
                        boolean newAdmin = registerArray.get(x).getAdmin();
                        out.println(Newname +" "+newAdmin);
                    }

                }
                catch(IOException e){
                    
                }
            }
            
        }
        if(flag==false){
                System.out.println("The User you have entered is not registered as a user. Please try again");
            }
    }
}


