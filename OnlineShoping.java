import java.util.Scanner;
import java.util.InputMismatchException;
public class OnlineShoping{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int PaymentAmount = 2300;
        try{
             System.out.println("Enter the price : ");
            int price = sc.nextInt();
            if( price <= 0){
                throw new Exception("Price should be greater than zero ");
            }
             System.out.println("Enter the quantity : ");
            int quantity = sc.nextInt();
             if(quantity <=0){
                throw new Exception("Price should be greater than zero ");
            }
            int totalAmount =  price * quantity;
            // 12 second on education
            if(totalAmount > price){
                throw new Exception("You have only "+ " "+ PaymentAmount +" "+ "money you can buy these number of the quantitiy");
            }
            int LeftAmount = PaymentAmount-totalAmount;
            System.out.println("Total Price :" + totalAmount);
             System.out.println("Total Price :" + LeftAmount);
        }
        catch(InputMismatchException e){
            System.out.println("Invlid input. Please enter number only.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       sc.close();

    }
}