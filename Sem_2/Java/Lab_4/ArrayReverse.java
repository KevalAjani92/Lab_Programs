import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter a["+i+"] Element:");
            a[i]=sc.nextInt();
        }
        System.out.println("\nReverse Order");
        for(int i=0;i<a.length;i++){
            System.out.print(a[a.length-i-1]+" ");
        }
        sc.close();
    }
}
