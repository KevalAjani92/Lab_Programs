import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int np=1;
        int nsp=n-1;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=np;j++){
                if(j%2!=0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            if(i<n){
                 np+=2;
                 nsp--;
            }
            else{
                 np-=2;
                 nsp++;
            }
            System.out.println("");
        }
        sc.close();
    }
}
