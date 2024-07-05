import java.util.*;
public class A_4_5_Factorial{
    public static int fec(int f){
        if(f==0 || f==1){
            return 1;
        }
        else{
            return f*fec(f-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int f;
        System.out.println("Enter your no. for find factorial");

        f = sc.nextInt();
        int ans = fec(f);
        // int ans = 1;

        // for(int i=1;i<=f;i++){
        //     ans = ans*i;
        // }

         System.out.println("factorial of "+f+" is "+ans);
    }
}