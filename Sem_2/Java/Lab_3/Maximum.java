import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a=sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        System.out.print("Enter Third Number:");
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("First Number is Maximum");
            }else System.out.println("Third Number is Maximum");
        }else{
            if(b>c){
                System.out.println("Second Number is Maximum");
            }else System.out.println("Third Number is Maximum");
        }
        sc.close();
    }
}
