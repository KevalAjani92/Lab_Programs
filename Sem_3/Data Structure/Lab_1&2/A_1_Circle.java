import java.util.*;
public class A_1_Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Enter radius");
        r = sc.nextDouble();
        System.out.println("Area of circle is"+(Math.PI*r*r));
    }
}