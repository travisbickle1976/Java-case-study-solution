import java.util.Stack;
import java.util.Scanner;

public class ParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> parking = new Stack<>();

        int capacity = 5;
        System.out.print("Enter number of cars trying to park: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter car number: ");
            String car = sc.nextLine();

            if (parking.size() < capacity) {
                parking.push(car);
                System.out.println(car + " parked successfully.");
            } else {
                System.out.println("Parking is full. " + car + " rejected.");
            }
        }
        System.out.println("\nCars currently parked:");
        System.out.println(parking);
        if (!parking.isEmpty()) {

            String removedCar = parking.pop();

            System.out.println("\n" + removedCar + " has left the parking area.");
        }
        System.out.println("\nRemaining cars:");
        System.out.println(parking);
        System.out.print("\nEnter parking hours: ");
        int hours = sc.nextInt();

        int charge;

        if (hours <= 2) {
            charge = 50;
        } else {
            charge = 50 + (hours - 2) * 20;
        }

        System.out.println("Parking charge: ₹" + charge);

        sc.close();
    }
}