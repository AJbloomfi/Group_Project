/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @Author Aaron Bloomfield
 */
//GuestUser class
public class GuestUser extends User{
    
    /**
     * Default constructor to initialize the guest user class.
     */
    public GuestUser(){
    }
    /**
     * Method that imports a text file and then allows a guest user to register.
     * @throws IOException 
     */
    public void BecomeUser()throws IOException{
        try(FileWriter fw = new FileWriter("registeredusers.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
        {
            System.out.println("What would you like your username to be?");
            Scanner input = new Scanner(System.in);
            String username = input.next();
            out.println(username+ " "+"false");
            
        }
        catch(IOException e){
            
        }
    }
}
