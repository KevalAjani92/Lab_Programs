import java.util.Scanner;

public class A_91 {

    public static int binarySearch(int[] arr,int key){
        int left=0,right=arr.length-1;
        while (left<=right) {
            int middle=(left+right)/2;
            if(arr[middle]==key){
                return middle;
            }else if(key<arr[middle]){
                right=middle-1;
            }else{
                left=middle+1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr,int left,int right,int key){
        if(left<=right){
            int middle=(left+right)/2;
            if(arr[middle]==key){
                return middle;
            }else if(key<arr[middle]){
                return binarySearchRecursion(arr, left, middle-1, key);
            }else{
                return binarySearchRecursion(arr, middle+1, right, key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,6,8,10,12,14};
        System.out.print("Enter Element To Search : ");
        int key=sc.nextInt();
        // int ans=binarySearch(arr, key);
        int ans=binarySearchRecursion(arr, 0, arr.length-1, key);
        if(ans!=-1){
            System.out.println(key+" Found At Index : "+ans);
        }else{
            System.out.println("Not Found");
        }
    }
}
