import java.util.Scanner;

public class B_24 {
    public static int findElement(int[] arr,int low,int high,int key){
        if(high<low){
            return -1;
        }
        int mid=(high+low)/2;

        if(key==arr[mid]){
            return mid;
        }
        if(key>arr[mid]){
            return findElement(arr, (mid+1), high, key);
        }
        return findElement(arr, low, (mid-1), key);
    }
    public static int deleteElement(int[] arr, int key) {
        int pos=findElement(arr, 0, arr.length-1, key);
        if (pos==-1){
            System.out.println("Element Not Found");
            return arr.length;
        }
            for (int i = pos; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        return arr.length - 1;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (Size Of Array): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element which you want to delete : ");
        int m = sc.nextInt();

        n = deleteElement(arr, m);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
    }
}
