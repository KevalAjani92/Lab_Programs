import java.util.Scanner;

public class A_21 {
    public static int[] insertElement(int[] arr,int element,int position){
        for(int i=arr.length-2;i>=position;i--){
            arr[i+1]=arr[i];
        }
        arr[position]=element;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n (Size Of Array) : ");
        int n=sc.nextInt();

        int[] arr=new int[n+1];
        for(int i=0;i<arr.length-1;i++){
            System.out.print("Enter Element arr["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter an Element to insert : ");
        int element=sc.nextInt();
        System.out.print("Enter index where you want to insert : ");
        int position=sc.nextInt();
        arr=insertElement(arr, element, position);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
    }
}