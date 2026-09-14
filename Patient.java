import java.util.Scanner;

public class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    void checkTemperature() {

        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }

    void displayDetails() {

        System.out.println("\n--- Patient Details ---");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Temperature : " + temperature + "°F");

        System.out.print("Status : ");
        checkTemperature();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        System.out.print("Enter patient ID : ");
        patient.patientId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter patient name : ");
        patient.name = sc.nextLine();
        System.out.print("Enter patient age : ");
        patient.age = sc.nextInt();
        System.out.print("Enter temperature : ");
        patient.temperature = sc.nextDouble();
        patient.displayDetails();
        sc.close();
    }
}