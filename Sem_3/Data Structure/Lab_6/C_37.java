import java.util.Scanner;
class InSufficientFundException extends Exception{
    InSufficientFundException(String str){
        super(str);
    }
}
class Account{
    Scanner sc=new Scanner(System.in);
    private int totalBalance;
    long accountNumber;
    String name;
    int getBalance(){
        return totalBalance;
    }
    Account(int totalBalance){
        this.totalBalance=totalBalance;
    }
    void setData(){
        System.out.print("Enter Name :");
        this.name =sc.next();
        System.out.print("Enter Account Number :");
        this.accountNumber =sc.nextLong();
    }
    public void withdrawl(int amount) throws Exception{
        if(amount>totalBalance){
            throw new InSufficientFundException("You Have Not Sufficient Balance");
        }else{
            totalBalance-=amount;
        }
    }
    public void deposit(int amount){
        totalBalance+=amount;
    }
}
public class C_37{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n:");
        int n=sc.nextInt();

        Account[] a=new Account[n]; 

        for (int i = 0; i < a.length; i++) {
            System.out.println("Detail Of Customer "+(i+1));
            System.out.print("Enter Balance Of Customer "+(i+1)+" : ");
            int balance=sc.nextInt();
            a[i]=new Account(balance);
            a[i].setData();
        }
        System.out.print("Enter Index to Withdraw Or Deposit Or CheckBalance : ");
        int index =sc.nextInt();

        System.out.println("Enter \"W\" For Withdrawl \"D\" For Deposit \"C\" For Check Balance : ");
        String check=sc.next();

        System.out.println("Enter Amount For Withdrawl Or Deposit : ");
        int amount=sc.nextInt();
        try{
            if(check.toLowerCase().equals("w")){
                a[index].withdrawl(amount);
            }else if(check.toLowerCase().equals("d")){
                a[index].deposit(amount);
            }else{
                System.out.println("Available Balance = "+a[index].getBalance());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Available Balance = "+a[index].getBalance());
    }
}