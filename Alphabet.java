/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codekata;
import java.util.*;


public class Alphabet {
    char a;
    void check(){
        System.out.println("Enter a letter: ");
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
      
      if( (a>='a' && a<='z') || (a>='A' && a<='Z')){
        System.out.println("Alphabet");
       } else {
        System.out.println("No");
       }
   }
    public static void main(String[]args){
       Alphabet al=new Alphabet();
       al.check();
    
}
}