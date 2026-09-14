import java.util.Scanner;
import java.util.InputMismatchException;
public class BankAccountWithdrawl{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        try{
            System.out.println("Enter withdrawal amount : ");
            double amount = sc.nextDouble();
            if(amount <= 0){
                throw new Exception("Invalid withrawl amount. Amount must be greater than zero ");
            }
            if(amount > balance){
                throw new Exception("Insufficient balance. Available balance is ");
            }
            balance = balance - amount;
            System.out.println("Withdrawl sucessfull.");
            System.out.println("Amount withdrawn : "+ amount);
            System.out.println("Remaining balance : "+balance);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a number only. ");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}