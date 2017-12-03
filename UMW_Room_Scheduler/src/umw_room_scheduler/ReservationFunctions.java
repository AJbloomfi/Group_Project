/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umw_room_scheduler;

import java.util.ArrayList;

/**
 *
 * @author Joe
 */
public class ReservationFunctions {
ArrayList<Reservation> serve = new ArrayList<>();
Reservation remres;


public void removeReservation(Reservation rem){
this.remres = rem;
    serve.remove(rem);

}
    
}
