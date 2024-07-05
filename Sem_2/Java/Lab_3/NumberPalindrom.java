import java.util.Scanner;
public class NumberPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int a=sc.nextInt();
        
        int rem=0,sum=0,b=a;
        while (a!=0) {
            rem=a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        if (sum==b) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
        sc.close();
    }
}
