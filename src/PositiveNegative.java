import java.util.Scanner;

/* This program is for letting the user know that the number entered by him is positive
negative or zero
 */
public class PositiveNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// making object for scanner class to enable user input
        System.out.print("Enter any number :");
        int i = scanner.nextInt();//user enters a number
        if(i>0) { // if else conditions for required output
            System.out.print(i + "  is a positive number");
        }else if(i<0){
            System.out.print(i + "  is a negative number");
        }else{
            System.out.print("You have entered Zero");
        }

        }
    }

