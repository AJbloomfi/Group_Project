/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author AaronBloomfield
 */
public class Person {
    private String name;
    private ArrayList<String> friends;
    private int count;
    
    public Person (String n){
        name = n;
        friends = 0;
    }
    public String getName(){
        return name;
    }
    public void addFriend(String friend){
        for (int i =0; i <5; i++){
            friends.add(i);
        }
        
    }
    public boolean hasFriend( String friend){
        for (int i = 0; i < 5; i++)
            if (friends.contains(i)){
                return true;
            }
        return false;
    }
    public String getFriends(){
        return friends.toString();
    }
    public String unfriend(String friend){
        return friends.remove();
    }
    
}
    
