/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codekata;

/**
 *
 * @author crm systems
 */
import java.util.*;
public class LeapYear {
    
     
    public static void main (String[]args){
       int yr;
       System.out.println("Enter year: ");
       Scanner sc=new Scanner(System.in);
       yr=sc.nextInt();
       if(yr%400==0){
        System.out.println("Leap year");
       }else if(yr%4==0 && yr%100!=0){
           System.out.println("Leap year");
       }else{
             System.out.println("Not a Leap year");
       }
       
    }
}
