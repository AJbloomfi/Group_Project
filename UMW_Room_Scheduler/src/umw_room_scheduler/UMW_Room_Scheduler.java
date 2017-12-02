
package umw_room_scheduler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
   public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Start");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 600, 800);
        
        primaryStage.setTitle("UMW Room Scheduler");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        launch(args);
    }
    
}
