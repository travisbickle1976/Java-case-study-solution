class Theatre{
    private int availableSeats = 5;
    synchronized void bookSeats(int seats){
        System.out.println(Thread.currentThread().getName() + " is trying to book  " + seats + "  seats");
        if(availableSeats >= seats){
            System.out.println( Thread.currentThread().getName()+" is booking "+seats +" seats");
            availableSeats = availableSeats - seats;
            System.out.println("Booking successful.\n Seats remaining = " + availableSeats);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" can not able to book only avilable seats " + availableSeats );
        }
    }
    
}

class Customer extends Thread{
    Theatre theatre;
    int seats;
    Customer(Theatre theatre, int seats){
        this.theatre = theatre;
        this.seats = seats;
    }
    public void run(){
        theatre.bookSeats(seats);
    }
}

public class TheaterSeat{
    public static void main(String[]args){
        Theatre theatre = new Theatre();
        Customer c1 = new Customer(theatre, 3);
        Customer c2 = new Customer(theatre , 2);
        Customer c3 = new Customer( theatre , 2);
        c1.setName("Customer 1");
        c2.setName("Customer 2");
        c3.setName("Customer 3");
        c1.start();
        c2.start();
        c3.start();
    }
}

