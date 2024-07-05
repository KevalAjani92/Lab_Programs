import java.util.*;
public class C_9_Time{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sec;
        System.out.println("Enter your second");
        sec = sc.nextInt();

        int h;
        int m;

        h = sec/3600;

        m = (sec%3600)/60;

        sec = sec - (h*3600 + m*60);

        System.out.println(h+":"+m+":"+sec);
        
    }
}