import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        a=sc.nextInt();                 //For Taking Int Value From Keyboard
        System.out.println(a);


        boolean b1=sc.hasNextInt();    // For checking that entered Value Is Integer Or Not
        System.out.println(b1);
        sc.close();
    }
}