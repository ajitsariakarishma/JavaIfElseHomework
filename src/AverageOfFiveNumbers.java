import java.util.Scanner;

//user inputs any five numbers and system displays the average of those numbers
public class AverageOfFiveNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // object for Scanner class
        System.out.print("Enter first number :");
        int a = scanner.nextInt();  // User inputs first number
        System.out.print("Enter second number :");
        int b = scanner.nextInt();
        System.out.print("Enter third number :");
        int c = scanner.nextInt();
        System.out.print("Enter forth number :");
        int d = scanner.nextInt();
        System.out.print("Enter fifth number :");
        int e = scanner.nextInt();
        System.out.print("Average of numbers :" +((a+b+c+d+e)/5));// calculating average while printing






    }
}
