import java.util.Scanner;

public class C_19 {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int nCr(int n, int r) {
        int ans = fact(n) / (fact(r) * (fact(n - r)));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            int a = 0;
            for (int j = 0; j <= 2 * i + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print(nCr(i, a)+" ");
                    a++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}