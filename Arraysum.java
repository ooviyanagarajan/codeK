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
public class Arraysum {
    void SumofArray(){
             
        int N, sum=0;
         System.out.println("Enter the no. of elements: ");   
         Scanner sc=new Scanner(System.in);
         N=sc.nextInt();
        
         int[] array1=new int[N];
          N=array1.length;
                
         System.out.println("Enter "+N+ " Elements: ");
         
           for(int i=0;i<N;i++){
             array1[i]=sc.nextInt();
        }
        System.out.println("Enter first K elements to sum: ");    
       int   K=sc.nextInt();    
       for(int i=0;i<K;i++){
           sum=sum+array1[i];
       }
       System.out.println("Sum of First " +K+ " elements: "+sum);
    }
    public static void main(String[]args){
        Arraysum as=new Arraysum();
        as.SumofArray();
        
    }
}
