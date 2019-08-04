/* This program is for printing interchanged value of a two
numbers entered b y user
 */

import java.util.Scanner;

public class InterchangingValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int a = scanner.nextInt();//user inputs  first number which is stored in variable a
        System.out.print("Enter your second number:");
        int b = scanner.nextInt();//user inputs second number which is stored in variable b
        System.out.println("Before interchanging value of first number "+a);
        System.out.println("Before interchanging value of second number "+b);
        int c = a;//interchanging values of number by storing it in a temporary variable c
        a = b;// so now value of a is stored in variable c and a = b
        b = c;// b get the value of a from c
        System.out.println("After interchanging value of first number "+a);
        System.out.println("After interchanging value of second number "+b);





    }
}
