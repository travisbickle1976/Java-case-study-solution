import java.util.Scanner;
class CourseRegistration{
    String name;
    int count = 0;
    String course[] = new String[5];
    void resistration(String cours){
        if(count < 5){
            course[count] = cours; 
            count++;
        }
        else{
            System.out.print("You cannot resister for more than 5 course. ");
        }
    }
    void displayCourse(){
        System.out.println("\n--- Resister Course ---");
        for(int i=0;i<count;i++){
            System.out.print((i+1) +"."+ course[i]+"\n");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         CourseRegistration coursereg = new CourseRegistration();
        System.out.println("Enter Your Beautiful name : ");
        coursereg.name = sc.nextLine();
        System.out.println("Enter your course  : ");
        for(int i=0;i<6;i++){
            String res = sc.nextLine();
           coursereg.resistration(res);
        }
        coursereg.displayCourse();
        sc.close();
    }
}
