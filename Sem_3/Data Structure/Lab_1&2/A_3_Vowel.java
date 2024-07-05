import java.util.*;

public class A_3_Vowel {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your charcter");
        c = sc.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'O' || c == 'I'
                || c == 'U') {
            System.out.println("Enter charcter is vowel");
        } else
            System.out.println("Enter charcter is consonant");

    }
}