/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.beans.property.SimpleStringProperty;

/**This class encapsulates data about a registered user including a name and a boolean variable if 
 * he/she is an administrator.
 *
 * @Author Aaron Bloomfield
 */
public class RegisteredUser extends User{
    
    /**Default constructor to initialize a RegisteredUser.
     * @param name
     * @param BannerID
     */
    public RegisteredUser(String name, boolean admin){
         this.UserName = new SimpleStringProperty(name);
        isAdmin = admin;
        
    }
    /**Method to set the username as a simple string property.
     * @param UserName 
     */

    public void setUserName(String UserName) {
     this.UserName = new SimpleStringProperty(UserName);
    }
    /**
     * Method to set whether a registered user is an administrator or not.
     * @param isAdmin 
     */

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    /**
     * Non-default constructor for initializing an admin user.
     * @param name
     * @param admin 
     */
    public void AdminUser(String name, boolean admin){
         this.UserName = new SimpleStringProperty(name);
        isAdmin = admin;
        admin = false;
    }
    /**
     * Method to get the User name
     * @return 
     */
    public String getID(){
        return UserName.get();
    }
    /**
     * Method to return if its an admin or not.
     * @return 
     */
    public boolean getAdmin(){
        return isAdmin;
    }
    /**This method adds a reservation by importing information from a .txt file, then getting new information 
     * for a new reservation, and finally overwriting the .txt file with the new reservations.
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
   
    public void addReservation() throws FileNotFoundException, IOException{
        ArrayList<Reservation>reserveArray = null;
        reserveArray = new ArrayList<>();
        String fileName = "reservation.txt";
        File file = new File(fileName);
        Scanner read = new Scanner(file);
        /*
        while (read.hasNext()){
            String line = read.nextLine();
            String regExp = "\\s*(\\s|,)\\s*";
            String[] sValues = line.split(regExp);
            Reservation reserveList = new Reservation(sValues[0],sValues[1],Integer.parseInt(sValues[2]),sValues[3]);
            reserveArray.add(reserveList);
        }
        */
         
         try(FileWriter fw = new FileWriter("reservation.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
        {
            System.out.println("Would you like to make a reservation");
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter your username");
            String name = input.nextLine();
            System.out.println("Enter the room number");
            String number = input.nextLine();
            System.out.println("Enter whether or not you would like AV equipment(true or false");
            String AV = input.nextLine();
            System.out.println("Enter the name of the building youd like to reserve");
            String building = input.nextLine();
            System.out.println("Enter the date youd like to reserve(MMDDYY)");
            int date = input.nextInt();
            System.out.println("Enter the Time youd like to reserve in military time(1-24)");
            int time = input.nextInt();
           out.println(name+" "+number+" "+AV+" "+building+" "+date+" "+time);
          
         
         
    }
    
    }    
}    
