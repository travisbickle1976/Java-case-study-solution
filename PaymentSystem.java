import java.util.Scanner;
interface Payment{
    void pay();
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Payment made using Credit Card.");
    }
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Payment made using UPI");
    }
}

class NetBanking implements Payment{
    public void pay(){
        System.out.println("Payment made uing Net Banking. ");
    }
}

public class PaymentSystem{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your payment Method : ");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        Payment p;
        if(choice == 1){
            p = new CreditCard();
        }
        else if(choice == 2){
            p = new UPI();
        }
        else if(choice == 3){
            p = new NetBanking();
        }
        else{
            System.out.println("Invalid choice ");
            return;
        }
        p.pay();
        sc.close();
    }
}