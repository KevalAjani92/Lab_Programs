import java.util.Scanner;

public class A_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"] Element:");
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minPos=0,maxPos=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxPos=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minPos=i;
            }
        }
        System.out.println("Max Position = "+maxPos);
        System.out.println("Min Position = "+minPos);
    }
}
