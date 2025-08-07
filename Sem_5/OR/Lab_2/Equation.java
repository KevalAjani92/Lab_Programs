import java.util.Scanner;

public class Equation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = 0, x2 = 0;
        int max = 0;
        for(int i=0;i<=4;i++){
            x1 = i;
            x2 = 0;
            while ((x1+x2) <= 4) {
                int temp = 3*x1+2*x2;
                if(temp>max){
                    max = temp;
                    System.out.println("Max = "+max+" At X1="+x1+", X2="+x2);
                }
                x2++;
            }
        }
        System.out.println(max);
        sc.close();
    }
}