import java.util.Scanner;

public class B_17 {
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
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("This Array Contain Duplicate Element");
                    return;
                }
            }
        }
        System.out.println("This Array does not Contain Duplicate Elements");
    }
}
