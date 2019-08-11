
import java.util.*;
public class CountDigit {
    void sum(){
        int n,count=0;
        System.out.println("Enter an Integer: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
        n=n/10;
        count++;  
       }
        System.out.println("Number of Digits: "+count);
    }
        
    public static void main(String[]args){
        CountDigit si=new CountDigit();
        si.sum();
    }
    
}
