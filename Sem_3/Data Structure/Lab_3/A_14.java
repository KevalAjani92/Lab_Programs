import java.util.Scanner;

public class A_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int x=sc.nextInt();
        int[] arr=new int[x];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"] Element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Starting Index:");
        int m=sc.nextInt();
        System.out.print("Enter Ending Index:");
        int n=sc.nextInt();
        
        int sum=0;
        for(int i=m;i<=n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum From index "+m+" to "+n+" = "+sum);
    }
}
