
import java.util.*;
public class NaturalSum {
    public static void main(String[]args){
        int n,sum=0;;
        System.out.println("Enter total numbers: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of Natural Numbers upto "+n+" : "+sum);
    }
}
