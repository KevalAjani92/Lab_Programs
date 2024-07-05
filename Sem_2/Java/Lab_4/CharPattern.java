import java.util.Scanner;
public class CharPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your String:");
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s1.charAt(j));
            }
            System.out.println("");
        }
        sc.close();
    }
}
