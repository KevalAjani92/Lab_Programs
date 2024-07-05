import java.util.Scanner;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[4];
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.print("Enter a["+i+"] Element:");
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Average Of Elements:"+((double)sum/4));
        sc.close();
    }
}
