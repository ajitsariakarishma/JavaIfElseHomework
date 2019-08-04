import java.util.Scanner;
/*This is a program where student result is calculated on basis of percentage and
grade according to the same
 */

public class MarsheetPercentageBasis {                //Created a method
    public static void studentdata() {
        Scanner scanner = new Scanner(System.in);      //created object for Scanner Package
        System.out.print("Enter student name :");
        String name = scanner.next();
        System.out.print("Enter Rollno. :");
        int rollno = scanner.nextInt();
        System.out.print("Enter marks for English :");
        double english = scanner.nextDouble();
        System.out.print("Enter marks for Maths :");
        double maths = scanner.nextDouble();
        System.out.print("Enter marks for Science :");
        double science = scanner.nextDouble();
        double total = english + maths + science;  // adding values entered by user to get total
        System.out.println("Total marks obtained :" + total);
        double percentage = total *100 / 300; //Calculating the percentage

        System.out.println("percentage :" + percentage+ "%");
        if(percentage >=80){                             //grading according to percentage with if else ladder
                    System.out.println("grade is A+");
        } else if (percentage >= 60) {
            System.out.println("grade is A");
        }else if(percentage>=50) {
            System.out.println("grade is B");
        }else if (percentage>=35){
            System.out.println("grade is C");
        }else{System.out.println("grade fail");

        }

        }
        public static void main (String[]args){

            MarsheetPercentageBasis.studentdata();






                   }


    }