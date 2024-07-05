import java.util.*;
public class A_2_EvenOdd{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no.");
        n = sc.nextInt();

        if(n%2==0){
             System.out.println("Enter no.is even");
        }
        else{
             System.out.println("Enter no. is odd");
        }
    }
}