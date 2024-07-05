import java.util.Scanner;
public class Mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total Marks Per Subject:");
        int total=sc.nextInt();
        System.out.print("Enter First Subject Marks:");
        int a=sc.nextInt();
        while (a>total || a<0) {
            System.out.print("Enter Valid Marks:");
            a=sc.nextInt();
        }
        System.out.print("Enter Second Subject Marks:");
        int b=sc.nextInt();
        while (b>total || b<0) {
            System.out.print("Enter Valid Marks:");
            b=sc.nextInt();
        }
        System.out.print("Enter Third Subject Marks:");
        int c=sc.nextInt();
        while (c>total || c<0) {
            System.out.print("Enter Valid Marks:");
            c=sc.nextInt();
        }
        System.out.print("Enter Fourth Subject Marks:");
        int d=sc.nextInt();
        while (d>total || d<0) {
            System.out.print("Enter Valid Marks:");
            d=sc.nextInt();
        }
        System.out.print("Enter Fifth Subject Marks:");
        int e=sc.nextInt();
        while (e>total || e<0) {
            System.out.print("Enter Valid Marks:");
            e=sc.nextInt();
        }
        double res=(a+b+c+d+e)/(double)total*100/5;
        if (res>=60) {
            System.out.println("First Division");
        } else if (res>=50) {
            System.out.println("Second Division");
        }else if (res>=40) {
            System.out.println("Third Division");
        }else {
            System.out.println("Fail");
        }
        sc.close();
    }
}