import java.util.Scanner;
import java.util.ArrayList;
public class MarkOfStudent{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> students = new ArrayList<>();
    System.out.println("Enter the number of the subject : ");
    int num_of_student = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the mark of the subject : ");
    for(int i=0;i<num_of_student;i++){
        System.out.println((i+1)+" subject mark : ");
        int mark = sc.nextInt();
        students.add(mark);
    }
    double total_mark = 0;
    int i;
    for( i=0;i<num_of_student;i++){
        total_mark = total_mark + students.get(i);
    }
    double percentage;
    percentage = (double)(total_mark/num_of_student);
    char grade ;
    if(percentage >= 90){
        grade = 'A';
        System.out.println("Result of the marks : "+ grade);
    }
    else if(percentage >= 75){
        grade = 'B';
          System.out.println("Result of the marks : "+ grade);
    }
    else if(percentage >= 60){
        grade = 'C';
          System.out.println("Result of the marks : "+ grade);
    }
    else if(percentage >= 50){
        grade = 'D';
          System.out.println("Result of the marks : "+ grade);
    }
    else{
          System.out.println("Result of the marks : "+ " FAIL");
    }
    sc.close();
}

}