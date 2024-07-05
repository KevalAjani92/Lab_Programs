import java.util.Scanner;

public class A_33 {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("First Number : "+a+ "\nSecond Number : "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();

        swap(a, b);
    }
}
