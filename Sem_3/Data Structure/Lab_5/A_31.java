import java.util.Scanner;

public class A_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][2];
        int[][] b=new int[2][3];
        int[][] ans=new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("Enter Value In a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print("Enter Value In b[" + i + "][" + j + "] : ");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                int sum=0;
                for (int k = 0; k < a[0].length; k++) {
                    sum+=a[i][k]*b[k][j];
                }
                ans[i][j]=sum;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
