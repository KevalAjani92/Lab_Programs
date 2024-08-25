import java.util.Scanner;

public class A_90{

    public static int linearSearch(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,5,1,8,3,9};
        System.out.print("Enter Element To Search : ");
        int key=sc.nextInt();
        int ans=linearSearch(arr, key);
        if(ans!=-1){
            System.out.println(key+" Found At Index : "+ans);
        }else{
            System.out.println("Not Found");
        }
    }
}