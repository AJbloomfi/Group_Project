
package umw_room_scheduler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<RegisteredUser>registerArray = null;
        ArrayList<Room>roomArray = null;
        ArrayList<Reservation>reservationArray = null;
        String fileName = "reservation.txt";
        File file = new File(fileName);
        try{
            registerArray = new ArrayList<>();
            roomArray = new ArrayList<>();
            reservationArray = new ArrayList<>();
            Scanner read = new Scanner(file);
            while (read.hasNext()){
                String line = read.nextLine();
                String regExp = "\\s*(\\s|,)\\s*";
                String[] sValues = line.split(regExp);
                System.out.println(Arrays.toString(sValues));
                Reservation reservationList = new Reservation(sValues[0],sValues[1],Boolean.parseBoolean(sValues[2]), sValues[3], Integer.parseInt(sValues[4]));
                reservationArray.add(reservationList);
                
            }
          
        }
        catch(IOException e){
            System.err.println("Caught IOException:" + e.getMessage());
        }
       /* GuestUser Guest = new GuestUser();
        Guest.BecomeUser();
        AdminUser Admin = new AdminUser("Jazeb", true);
        Admin.RemoveUser();
*/
        launch(args);
    }
    
}
