import java.util.Scanner;

public class B_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int x=sc.nextInt();
        int[] arr=new int[x];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"] Element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Number To Change:");
        int m=sc.nextInt();
        System.out.print("Enter Replacement Number:");
        int n=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==m){
                arr[i]=n;
                System.out.println("Replaced At Index "+i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
