
import java.util.*;
public class Largest {
    int a,b,c;
    void check(){
       System.out.println("Enter three numbers: ");
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>b && a>c){
           System.out.println(a+" is larger.");
       }else if(b>a && b>c){
           System.out.println(b+" is larger.");
       }else{
           System.out.println(c+ " is larger.");
       }
        
    }
    public static void main(String[]args){
        Largest la=new Largest();
        la.check();
        
    }
    
}
