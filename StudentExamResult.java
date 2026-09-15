import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentExamResult{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number of subject: ");
            int subject = sc.nextInt();
            int total = 0;
            for(int i=1;i<=subject;i++){
                System.out.print("Enter marks for "+ i+": ");
                int mark = sc.nextInt();
                if(mark <=0||mark>100){
                    throw new Exception("Invalid Marks musst be in the between 0 to 100.");
                }
                total = total + mark;
            }
            double average = (double)total / subject;
            System.out.println("Total marks : "+ total);
            System.out.println("Total average : " + average);
        }
        catch(InputMismatchException e){
            System.out.println("Invlid input. Please enter number only.");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot calculate average. No subject entered.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       sc.close();
}
}