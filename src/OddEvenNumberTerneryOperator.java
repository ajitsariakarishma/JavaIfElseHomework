import java.util.Scanner;
//This is the program to let user enter two integers and printing whether entered numbers are odd or even

public class OddEvenNumberTerneryOperator {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);// Creating object for Scanner class
        System.out.println ("Enter first number :");
        int a = scanner.nextInt();          //user enters first number
        System.out.println("Enter second number :");
        int b = scanner.nextInt();          // user enters second number
        System.out.println((a%2==0)? "  First number entered is an even number.":"First number entered is an odd number.");


        System.out.println((b%2==0)?  "Second number entered is an even number.": "Second number entered is an odd number.");





    }

    }

