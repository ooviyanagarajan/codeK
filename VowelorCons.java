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
public class VowelorCons {
    public static void main(String[]args){
        char vc;
        System.out.println("Enter a character: ");
        Scanner sc=new Scanner(System.in);
     try{  
        vc=sc.next(".").charAt(0);              
       if(vc=='a'|| vc=='e'|| vc=='i'|| vc=='o'|| vc=='u'||vc=='A'|| vc=='E'|| vc=='I'|| vc=='O'|| vc=='U' ){
        System.out.println("Vowel");
       }else if( (vc>='a' && vc<='z') || (vc>='A' && vc<='Z')){
            System.out.println("Consonant");  
        } else{
           System.out.println("Invalid Input!");
       }
     }catch(Exception e){
          System.out.println("Invalid Input");
     }  
}
}
