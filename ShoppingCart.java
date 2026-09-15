import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cart = new ArrayList<>();
        System.out.print("Enter number of products to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            cart.add(product);
        }
        System.out.println("\nProducts in cart:");

        for (String product : cart) {
            System.out.println(product);
        }
        System.out.print("\nEnter product to search: ");
        String searchProduct = sc.nextLine();

        if (cart.contains(searchProduct)) {
            System.out.println(searchProduct + " is in the cart.");
        } else {
            System.out.println(searchProduct + " is not in the cart.");
        }
        System.out.print("\nEnter product to remove: ");
        String removeProduct = sc.nextLine();

        if (cart.remove(removeProduct)) {
            System.out.println(removeProduct + " removed successfully.");
        } else {
            System.out.println(removeProduct + " was not found in the cart.");
        }
        System.out.println("\nUpdated cart:");

        for (String product : cart) {
            System.out.println(product);
        }

        sc.close();
    }
}