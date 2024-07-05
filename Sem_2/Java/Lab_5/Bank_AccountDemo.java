import java.util.Scanner;
class Bank_Account{
    Scanner sc=new Scanner(System.in);
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;
    void getAccountDetails(){
        System.out.print("Enter Account Number:");
        accountNo=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter UserName:");
        userName=sc.nextLine();
        System.out.print("Enter E-mail id:");
        email=sc.nextLine();
        System.out.print("Enter Account Type:");
        accountType=sc.nextLine();
        System.out.print("Enter Account Balance:");
        accountBalance=sc.nextInt();
    }
    void displayAccountDetails(){
        System.out.println("\nAccount Details\n");
        System.out.println("UserName : "+userName);
        System.out.println("AccountNumber : "+accountNo);
        System.out.println("E-mail Id : "+email);
        System.out.println("Account Type : "+accountType);
        System.out.println("Account Balance : "+accountBalance);
    }
}
public class Bank_AccountDemo {
    public static void main(String[] args) {
        Bank_Account b1=new Bank_Account();
        b1.getAccountDetails();
        b1.displayAccountDetails();
    }
}
