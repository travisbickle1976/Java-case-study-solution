import java.util.Scanner;
public class Employee{
    
    int employeeId;
    String employeeName;
    double basicSalary;

    void calculateSalary(){
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\n---Salary Details--");
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("HRA : "+hra);
        System.out.println("DA : "+da);
        System.out.println("Gross salary : "+grossSalary);

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter employee ID : ");
        employee.employeeId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name : ");
        employee.employeeName = sc.nextLine();
        System.out.print("Enter basic salary : ");
        employee.basicSalary = sc.nextDouble();
        employee.calculateSalary();
        sc.close();
    }
}