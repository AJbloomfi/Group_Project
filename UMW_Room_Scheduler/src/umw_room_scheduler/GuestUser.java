/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @Author Aaron Bloomfield
 */
//GuestUser class
public class GuestUser extends User{
    
    
    public GuestUser(){
    }
    public void BecomeUser(){
        PrintWriter fw = null;
        try{
            fw = new PrintWriter("registeredusers.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("What would you like you UserName to be?");
            Scanner input = new Scanner(System.in);
            String username = input.next();
            bw.write(username);
            fw.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
