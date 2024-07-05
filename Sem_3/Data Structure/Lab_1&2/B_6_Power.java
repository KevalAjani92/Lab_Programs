import java.util.*;
public class B_6_Power{
    public static void main(String[] args){
          int f,p;
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.");
        f = sc.nextInt();
        System.out.println("Enter your power");
        p = sc.nextInt();

        int ans = 1;
        for(int i=1;i<=p;i++){
            ans = ans*f;
        }

        System.out.println("ans of"+f+"race to"+p+"="+ans);
    }
}