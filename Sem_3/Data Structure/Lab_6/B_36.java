import java.util.Scanner;

public class B_36 {

    static double FToC(double f){
        return ((f-32)*(5/9));
    }
    static double CToF(double c){
        return (((9/5)*c)+32);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenhit : ");
        double f=sc.nextDouble();
        System.out.print("Enter Celcius : ");
        double c=sc.nextDouble();

        System.out.println(f+" Fahrenhit To Celcius = "+FToC(f));
        System.out.println(c+" Celcius To Fahrenhit  = "+CToF(c));
    }
}
