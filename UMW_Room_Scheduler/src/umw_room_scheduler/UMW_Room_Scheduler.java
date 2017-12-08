
package umw_room_scheduler;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Joe Cheeks
 */
public class UMW_Room_Scheduler extends Application{
    
   @Override
   public void start(Stage primaryStage) throws IOException {
        Button btn = new Button();
        btn.setText("Start");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            }
        });
         try {
                    Parent StartParent = FXMLLoader.load(getClass().getResource("FXMLlogin.fxml"));
                    Scene StartScene = new Scene(StartParent);
                   
                } catch (IOException ex) {
                    Logger.getLogger(UMW_Room_Scheduler.class.getName()).log(Level.SEVERE, null, ex);
                }
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 600, 800);
       Parent StartParent = FXMLLoader.load(getClass().getResource("FXMLlogin.fxml"));
        
         Scene scene1 = new Scene(StartParent);
        
        primaryStage.setTitle("UMW Room Scheduler");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * main argument 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {

    /**
     *
     */
 
        ArrayList<RegisteredUser>registerArray = null;
        ArrayList<Room>roomArray = null;
        ArrayList<Reservation>reservationArray = null;
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
                roomArray.add(rm);
                System.out.println(Arrays.toString(sValues));
                String[] day = sValues[4].split("(?<=\\G..)");
                
               Integer.parseInt(day[0]);
//               DatePicker d =  new LocalDate();
               LocalDate daytemp = LocalDate.of(Integer.parseInt(day[0]),Integer.parseInt(day[1]),Integer.parseInt(day[2]));
              // (Integer.parseInt(day[0]),Integer.parseInt(day[1]),Integer.parseInt(day[2])));
//               Reservation reservationList = new Reservation(sValues[0],rm,true,daytemp,Integer.parseInt(sValues[5]),Integer.parseInt(sValues[6]));
//               reservationArray.add(reservationList);
                
            }
          
        }
    
        catch(IOException e){
            System.err.println("Caught IOException:" + e.getMessage());
        }
   

       /* GuestUser Guest = new GuestUser();
        Guest.BecomeUser();
        AdminUser Admin = new AdminUser("Jazeb", true);
        Admin.RemoveUser();*/
//        RegisteredUser register1 = new RegisteredUser("aaron", false);
//        register1.addReservation();

    launch(args);
}

}

    

