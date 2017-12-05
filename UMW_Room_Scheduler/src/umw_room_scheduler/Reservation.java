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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class Reservation {
    protected String UserName;   
    private Room roomBuilding;
    LocalDate date;
    int time;

    
    public Reservation( String name,Room build, LocalDate d, int t){
        name = UserName;
        build = roomBuilding;
        d = date;
        t = time;
    }
    public String getName(){
        return UserName;
    }
    public Room getBuild(){
        return roomBuilding;
    }
    public LocalDate getDate(){
        return date;
    }
    public int getTime(){
        return time;
    }
      
}
