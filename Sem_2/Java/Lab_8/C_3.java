import java.util.Scanner;

class InSufficientFundException extends Exception {
    InSufficientFundException(String str) {
        super(str);
    }
}

class Account {
    private int totalBalance;

    int getBalance() {
        return totalBalance;
    }

    Account(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void withdrawl(int amount) throws Exception {
        if (amount > totalBalance) {
            throw new InSufficientFundException("You Have Not Sufficient Balance");
        } else {
            totalBalance -= amount;
        }
    }

    public void deposit(int amount) {
        totalBalance += amount;
    }
}

public class C_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account(50000);

        System.out.println("Enter \"W\" For Withdrawl \"D\" For Deposit");
        String check = sc.nextLine();

        System.out.println("Enter Amount For WithdrawFl Or Deposit");
        int amount = sc.nextInt();
        try {
            if (check.toLowerCase().equals("w")) {
                a1.withdrawl(amount);
            } else {
                a1.deposit(amount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Available Balance = " + a1.getBalance());
    }
}