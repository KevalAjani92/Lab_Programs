import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt(); 
        for(int i=1;i<=n;i++){
            int diff=n-1,sum=diff+i;
            System.out.print(i+" ");
            for(int j=1;j<i;j++){
                System.out.print(sum+" ");
                diff--;
                sum+=diff;
            }
            System.out.println("");
        }
        sc.close();
    }
}
