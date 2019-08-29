 /* This program calucaltes result on basis of marks obtained in each subject by
 taking user input for the same
  */
import java.util.Scanner;

public class PassFail {

    public static double[] getDoubleArray() {                                                   // method defined
        Scanner scanner = new Scanner(System.in);      // creating object of Scanner package to get user input
        System.out.print("Enter student name :");
        String name = scanner.next();
        System.out.print("Enter Rollno. :");
        int rollno = scanner.nextInt();
        double marks[] = new double[5];
        System.out.print(" Enter marks for English :");
        marks[0] = scanner.nextDouble();
        System.out.print(" Enter marks for Maths :");
        marks[1] = scanner.nextDouble();
        System.out.print(" Enter marks for Science :");
        marks[2] = scanner.nextDouble();
         marks[3] = marks[0]+marks[1]+marks[2];
         marks[4]=(marks[3]*100)/300;
        //return total;
        return marks;

    }

    public static void main(String[] args) {

        double a[] = getDoubleArray();

        System.out.println("total marks objained : "+a[3]);
        System.out.println("percentage obtaines is : "+a[4]+"%");
        if (a[0] >= 35 && a[1] >= 35 && a[2] >= 35) {      //defining condition for result
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }

    }
}






