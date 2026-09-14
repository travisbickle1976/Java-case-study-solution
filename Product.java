import java.util.Scanner;

public class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    double calculateCost() {
        return price * quantity;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.print("Enter product ID : ");
        product.productId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name : ");
        product.productName = sc.nextLine();
        System.out.print("Enter price : ");
        product.price = sc.nextDouble();
        System.out.print("Enter quantity : ");
        product.quantity = sc.nextInt();
        double totalBill = product.calculateCost();
        double discount = 0;
        if (totalBill > 5000) {
            discount = totalBill * 0.10;
        }

        double finalBill = totalBill - discount;

        System.out.println("\n--- Shopping Cart ---");
        System.out.println("Product ID : " + product.productId);
        System.out.println("Product Name : " + product.productName);
        System.out.println("Price : " + product.price);
        System.out.println("Quantity : " + product.quantity);
        System.out.println("Product Cost : " + totalBill);
        System.out.println("Discount : " + discount);
        System.out.println("Final Bill : " + finalBill);

        sc.close();
    }
}