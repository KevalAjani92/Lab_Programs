import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int a=sc.nextInt();
        boolean flag=false;

        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                flag=true;
                break;
            }
        }
        if (flag || a==1) {
            System.out.println("Entered Number Is Not Prime");
        } else {
            System.out.println("Entered Number Is Prime");
        }
        sc.close();
    }
}
