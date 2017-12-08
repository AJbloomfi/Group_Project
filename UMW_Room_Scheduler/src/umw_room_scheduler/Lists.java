/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class Lists {
public ArrayList<Reservation> reservationArray;
public Lists() throws FileNotFoundException{
 ArrayList<RegisteredUser>registerArray = null;
        ArrayList<Room>roomArray = null;
        
        String fileName = "reservation.txt";
        File file = new File(fileName);
        try{
            
           roomArray = new ArrayList<>();
          
         reservationArray = new ArrayList<>();
            Scanner read = new Scanner(file);
            while (read.hasNext()){
                String line = read.nextLine();
                String regExp = "\\s*(\\s|,)\\s*";
                String[] sValues = line.split(regExp);
                Room rm = new Room(sValues[1],sValues[2],Boolean.parseBoolean(sValues[3]));
                String rmString = rm.toString();
//                roomArray.add(rm);
                System.out.println(Arrays.toString(sValues));
               // String[] day = sValues[4].split("(?<=\\G..)");
               String day1 = sValues[4]; 
            //   Integer.parseInt(day[0]);
//               DatePicker d =  new LocalDate();
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
               LocalDate daytemp1 = LocalDate.parse(day1,formatter);
//               LocalDate daytemp = LocalDate.of(Integer.parseInt(day[0]),Integer.parseInt(day[1]),Integer.parseInt(day[2]));
              // (Integer.parseInt(day[0]),Integer.parseInt(day[1]),Integer.parseInt(day[2])));
               Reservation reservationList = new Reservation(sValues[0],rm.getRoomName(),true,daytemp1 ,sValues[5],sValues[6]);
               reservationArray.add(reservationList);
                System.out.println(reservationArray);
               }
          
        }
    
        catch(IOException e){
            System.err.println("Caught IOException:" + e.getMessage());
        }
        
}
public ArrayList<Reservation> getReservationslist(){
 
    
    return reservationArray;
}

}
