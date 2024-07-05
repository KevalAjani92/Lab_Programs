import java.util.Scanner;
public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s1=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<=s1.length()/2;i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                flag=false;
                break;
            }
        }
        if (flag) {
            System.out.println("Entered String Is Palindrom");
        } else {
            System.out.println("Entered String Is Not Palindrom");
        }
        sc.close();
    }
}
