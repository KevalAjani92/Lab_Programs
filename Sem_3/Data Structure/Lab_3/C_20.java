import java.util.Scanner;

public class C_20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n =sc.nextInt();

        String[] str=new String[n];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter Element str["+i+"] : ");
            str[i]=sc.next();
        }
        String temp;
        for (int i = 0; i < str.length; i++) {
            for(int j=i+1;j<str.length;j++){
                if(str[i].compareTo(str[i+1])>0){
                    temp=str[i];
                    str[i]=str[i+1];
                    str[i+1]=temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
