import java.util.Scanner;
public class HollowTriangle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter n:");
       int n=sc.nextInt();
       int nsp=n-1,np=1;
       for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=np;j++){
                if(i<n){
                    if(j==1||j==np){
                        System.out.print("*");
                    }else System.out.print(" ");
                }else System.out.print("*");
            }
            System.out.println("");
            nsp--;
            np+=2;
        } 
        sc.close();
    }
}