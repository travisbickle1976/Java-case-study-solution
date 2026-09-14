import java.util.Scanner;
import java.util.InputMismatchException;
public class BusTicketBooking{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int available = 20;
        try{
            System.out.print("Enter passenger age : ");
            int age = sc.nextInt();
            if(age <= 0){
                throw new Exception("Invalid age . Age must be greater than zero");
            }
            System.out.print("Enter number of seats : ");
            int seats = sc.nextInt();
            if(seats <= 0){
                throw new Exception("Invalid number of seats. Seat must be greater than 0");
            }
            if(seats > available){
                throw new Exception("Insufficient seat. only " + available + "seats are available.");
            }
            System.out.println("Booking successfull : ");
            System.out.println("Passenger age : " + age);
            System.out.println("Seats booked : "+ seats);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input.Please enter number only.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();// main likhunga kya kar loge
    }
}