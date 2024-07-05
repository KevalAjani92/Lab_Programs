import java.util.*;

public class C_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        System.out.print("What Do You Want Uppercase Or Lowercase : ");
        String check = sc.next();

        if(check.equalsIgnoreCase("uppercase")){

            System.out.println(str.toUpperCase());
        }

        if(check.equalsIgnoreCase("lowercase")){

            System.out.println(str.toLowerCase());
        }
    }
}