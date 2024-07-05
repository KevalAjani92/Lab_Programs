import java.util.Scanner;

public class B_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of First Array : ");
        int n=sc.nextInt();

        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a["+i+"] : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Size Of Second Array : ");
        int m=sc.nextInt();

        int[] b=new int[m];
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter b["+i+"] : ");
            b[i]=sc.nextInt();
        }

        int[] result=new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            result[i]=a[i];
        }
        int temp=a.length;
        for (int i = 0; i < b.length; i++) {
            result[temp++]=b[i];
        }
        
        System.out.println("Merged Array");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
