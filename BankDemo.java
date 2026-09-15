class BankAccount{
    private int balance = 10000;
    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is trying to withdraw "+amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName()+" is withdrawing "+amount);
            balance = balance - amount;
            System.out.println("Remaining balance = " + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " cannot withdraw . Insufficient balance. ");
        }
    }
}


class Customer extends Thread{
    BankAccount account;
    int amount;
    Customer(BankAccount account, int amount){
        this.account = account;
        this.amount = amount;
    }
    public void run(){
        account.withdraw(amount);
    }
}


public class BankDemo{
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        Customer c1 = new Customer(account,7000);
        Customer c2 = new Customer(account,5000);
        c1.setName("Customer 1");
        c2.setName("Customer 2");
        c1.start();
        c2.start();
    }
}