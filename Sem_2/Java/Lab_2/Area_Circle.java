import java.util.Scanner;
public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:");
        double r=sc.nextDouble();
        double Area=3.14*r*r;
        System.out.println("Area Of Circle="+Area);
        sc.close();
    }
}
