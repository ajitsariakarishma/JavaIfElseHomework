import java.util.Scanner;
// This is a program where user enters any year and get to know whether its a leap year or not
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// creating object for Scanner package
        System.out.println("Enter any year :");// Asking user input
        int a = scanner.nextInt();// user inputs year
        if (a % 4 == 0) {
            System.out.println(" Year " + a + " is a leap year.)");
        } else {
            System.out.println("Year " + a + " is not a leap year.");
        }
    }
}