import java.util.Scanner;

public class String_Input {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter String 1:");
        // str=sc.next();      //For Reading a Word
        
        str= sc.nextLine();    //For Reading Complete String
        System.out.println(str);  
        sc.close();
    }
}
