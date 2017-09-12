/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author AaronBloomfield
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("enter a string length");
        int stringlength = input.nextInt();
        System.out.println("Enter four strings");
        String str1 = input.next();
        int strlength1 = str1.length();
        String str2 = input.next();
        int strlength2 = str2.length();
        String str3 = input.next();
        int strlength3 = str3.length();
        String str4 = input.next();
        int strlength4 = str4.length();
        int total = 0;
        if (strlength1==(stringlength)){
            total = total + 1;}
        if (strlength2==(stringlength)){
            total = total + 1;}
        if (strlength3==(stringlength)){
            total = total + 1;}
        if (strlength4==(stringlength)){
            total = total + 1;}
        System.out.println(total + " strings of length " + stringlength);
  
                
    }
    
}
