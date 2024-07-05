import java.util.Scanner;

public class B_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value In a[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i+1); j < arr.length; j++) {
                if(arr[i]==arr[j] && arr[i]!=-1){
                    arr[j]=-1;
                    count++;
                }
            }
        }
        int[] temp=new int[arr.length-count];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                temp[index++]=arr[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            if(i!=temp.length-1){
                System.out.print(",");
            }
        }
        sc.close();
    }
}
