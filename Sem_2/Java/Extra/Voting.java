import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String str){
        super(str);
    }
}
public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new YoungerAgeException("You Are Not Eligeble For Voting");
            }else System.out.println("Eligeble For Voting");
        }
        catch(YoungerAgeException e){
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
        System.out.println("After Checking");
    }
}
