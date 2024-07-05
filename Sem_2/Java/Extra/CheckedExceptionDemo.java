import java.util.Scanner;
class UnderAgeException extends Exception{
    UnderAgeException(){
        super("You Are Under Age");
    }
    UnderAgeException(String str){
        super(str);
    }
}
public class CheckedExceptionDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new UnderAgeException("Not Eligeble For Voting");
            }else System.out.println("Eligeble For Voting");
        }
        catch(UnderAgeException e){
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
