import java.util.Scanner;

public class A_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"] Element:");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}