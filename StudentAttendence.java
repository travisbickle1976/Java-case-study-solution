import java.util.ArrayList;
import java.util.Scanner;
public class StudentAttendence{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>students = new ArrayList<>();
        System.out.print("Enter number of student present : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" student : ");
            String name = sc.nextLine();
            students.add(name);
        }
        System.out.println("Student present : ");
        for(String student : students){
            System.out.println(student);
        }
        System.out.print("Enter student name to search : ");
        String searchName = sc.nextLine();
        if(students.contains(searchName)){
            System.out.println(searchName + " is present");
        }
        else{
            System.out.println(searchName + " is not present.");
        }
        System.out.print("Entre name to remove : ");
        String removeName = sc.nextLine();
        if(students.remove(removeName)){
            System.out.println("Remove successfully");
        }
        else{
            System.out.println(removeName + "  was not found");
        }
        System.out.println("Number of students present = "+students.size());
        sc.close();
    }
}