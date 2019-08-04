 /* This program calucaltes result on basis of marks obtained in each subject by
 taking user input for the same
  */
import java.util.Scanner;

public class PassFail {
    public static void result() {                                                   // method defined
        Scanner scanner = new Scanner(System.in);      // creating object of Scanner package to get user input
        System.out.print("Enter student name :");
        String name = scanner.next();
        System.out.print("Enter Rollno. :");
        int rollno = scanner.nextInt();
        System.out.print(" Enter marks for English :");
        double english = scanner.nextDouble();
        System.out.print(" Enter marks for Maths :");
        double maths = scanner.nextDouble();
        System.out.print(" Enter marks for Science :");
        double science = scanner.nextDouble();
        if (english >= 35 && maths >= 35 && science >= 35) {      //defining condition for result
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }

        public static void main (String[]args){

            result();
        }

}




