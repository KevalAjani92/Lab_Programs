import java.util.Scanner;
class Circle{
    double areaOfCircle(double radius){
        return Math.PI*radius*radius;
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:");
        double r=sc.nextDouble();
        Circle c=new Circle();
        double area=c.areaOfCircle(r);
        System.out.println("Area = "+area);
        sc.close();
    }
}