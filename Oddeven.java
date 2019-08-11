
import java.util.*;
public class Oddeven {
    int n;
    void check(){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
      
       try{
           n=sc.nextInt();
           if(n>0){
                if(n%2==0){
            System.out.println("Even number");
            }else {
               System.out.println("Odd Number");  
            }
          }else{
               System.out.println("Invalid Input!");
           }
          
           
       }catch(Exception e) {
            System.out.println("Invalid input");
       }
    }
    
   public static void main(String[]args){
       Oddeven oe=new Oddeven();
       oe.check();
   }
}
