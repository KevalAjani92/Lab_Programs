import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature In Fahrenheit:");
        double f=sc.nextDouble();
        double c=(f-32)*5/9;
        System.out.println("Entered Temperature In Celsius="+c);
        sc.close();
    }
}
