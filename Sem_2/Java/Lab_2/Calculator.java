import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Operation:");
        char oper=sc.next().charAt(0);
        System.out.print("Enter First Number:");
        int a=sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        while (oper=='/' && b==0) {
            System.out.print("Enter Valid Number:");
            b=sc.nextInt();
        }
        if (oper=='+') {
            System.out.println("Ans="+(a+b));
        }else if (oper=='-') {
            System.out.println("Ans="+(a-b));
        }else if (oper=='*') {
            System.out.println("Ans="+(a*b));
        }else if (oper=='/') {
            System.out.println("Ans="+((double)a/b));
        }
        sc.close();
    }
}
