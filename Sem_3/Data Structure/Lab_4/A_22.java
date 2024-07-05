import java.util.Scanner;

public class A_22 {
    public static int deleteElement(int[] arr, int index) {
        if (index < 0 || index >arr.length-1){
            System.out.println("Can't Delete");
            return arr.length;
        }
            for (int i = index; i < arr.length - 1; i++) {
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
        System.out.print("Enter index of an element which you want to delete : ");
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
