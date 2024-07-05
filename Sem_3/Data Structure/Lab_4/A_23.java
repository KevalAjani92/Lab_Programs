import java.util.Scanner;

public class A_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("Enter Element arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to insert : ");
        int element = sc.nextInt();

        boolean flag = false;
        int position = 0;
        int j=0;
        while(element >= arr[j] && j<arr.length-1){
                position = j+1;
                flag = true;
                j++;
        }
        if (flag) {
            for (int i = arr.length - 2; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
            arr[position] = element;
        } else {
            System.out.println("Can't Insert Element");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
