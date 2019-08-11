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
public class Hello {
    public static void main(String[]args){
        int n;
        System.out.println("Enter the number of times: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("HELLO");
        }
    }
}
