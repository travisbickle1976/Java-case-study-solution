import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {
5
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> salaries = new ArrayList<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            int salary = sc.nextInt();

            salaries.add(salary);
        }
        System.out.println("\nEmployee salaries:");

        for (int salary : salaries) {
            System.out.println(salary);
        }
        int highest = salaries.get(0);

        for (int salary : salaries) {
            if (salary > highest) {
                highest = salary;
            }
        }
        int total = 0;

        for (int salary : salaries) {
            total = total + salary;
        }
        double average = (double) total / salaries.size();
        System.out.println("\nHighest salary = " + highest);
        System.out.println("Total salary = " + total);
        System.out.println("Average salary = " + average);

        sc.close();
    }
}