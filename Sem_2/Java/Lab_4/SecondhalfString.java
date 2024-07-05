import java.util.Scanner;
public class SecondhalfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s1=sc.nextLine();
        
        System.out.println(s1.substring(s1.length()/2, s1.length()));
        sc.close();
    }
}