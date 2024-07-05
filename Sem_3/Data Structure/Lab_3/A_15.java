import java.util.Scanner;

public class A_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        double avg=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"] Element:");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=(double)sum/n;
        System.out.println("Average = "+avg);
    }
}
