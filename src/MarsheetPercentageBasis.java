import java.util.Scanner;
/*This is a program where student result is calculated on basis of percentage and
grade according to the same
 */

public class MarsheetPercentageBasis extends PassFail {


    public static void main(String[] args) {

        double b[]=  getDoubleArray();
        System.out.println("Total marks obtained : "+b[3]);
        System.out.println("Percentage obtained is : "+b[4] +"%");
        if (b[4] >= 80) {                   //grading according to percentage with if else ladder
            System.out.println("grade is A+");
        } else if (b[4]>= 60) {
            System.out.println("grade is A");
        } else if (b[4] >= 50) {
            System.out.println("grade is B");
        } else if (b[4] >= 35) {
            System.out.println("grade is C");
        } else {
            System.out.println("grade fail");
        }

    }






}



