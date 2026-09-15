import java.util.Scanner;
public class BankAccountt{
    int accountNumber;
    String accountHolder;
    double balance;
    
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Amount withdraw successfully.");
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance(){
        System.out.println("Account number : "+accountNumber);
        System.out.println("Account holder : "+accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        BankAccountt  account = new BankAccountt();
        System.out.println("Enter account number : ");
        account.accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder name : ");
        account.accountHolder = sc.nextLine();
        System.out.println("Enter initial balance : ");
        account.balance = sc.nextInt();
        System.out.print("Enter amount to deposit : ");
        double amount = sc.nextInt();
        account.deposit(amount);
        System.out.print("Enter amount to withdraw : ");
        double withdraw = sc.nextInt();
        account.withdraw(withdraw);
        System.out.println("\n--Account Details--");
        account.displayBalance();
        sc.close();
    }
}
