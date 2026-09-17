import java.util.Vector;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> marks = new Vector<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            int m = sc.nextInt();
            marks.add(m);
        }
        int passed = 0;
        for (int i = 0; i < marks.size(); i++) {

            int m = marks.get(i);

            System.out.print("Student " + (i + 1) + ": " + m + " - ");

            if (m >= 90) {
                System.out.println("Outstanding");
                passed++;
            }
            else if (m >= 75) {
                System.out.println("Distinction");
                passed++;
            }
            else if (m >= 60) {
                System.out.println("First Division");
                passed++;
            }
            else if (m >= 50) {
                System.out.println("Second Division");
                passed++;
            }
            else {
                System.out.println("Fail");
            }
        }
        System.out.println("\nTotal number of students: " + marks.size());
        System.out.println("Number of passed students: " + passed);
        sc.close();
    }
}