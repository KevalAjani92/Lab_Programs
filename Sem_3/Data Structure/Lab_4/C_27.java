import java.util.*;

public class C_27 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        StringBuilder sb=new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
                char temp=(char)((sb.charAt(i))+32);
                sb.setCharAt(i, temp);
            }else if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
                char temp=(char)((sb.charAt(i))-32);
                sb.setCharAt(i, temp);
            }
        }
        System.out.println(sb);
    }
}