import java.util.*;
public class B_7_Factor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" is factor of "+n);
            }
        }
    }
}