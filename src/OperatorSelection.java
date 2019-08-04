/*This program  to ask user to enter any two number and a operator (+, -, /, *)
 ﬁnd addition, subtraction, multiplication and division according to their symbol
 */

import java.util.Scanner;

public class OperatorSelection {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        double num1 = scanner.nextDouble();// user enters 1st number
        System.out.print("Enter your second number : ");
        double num2 = scanner.nextDouble();//User enters 2nd number
        System.out.print("Enter your choice of arithmetic operator (+,-,/,*) : ");
        char operator = scanner.next().charAt(0);
        if(operator=='+'){
            System.out.print("Sum of "+num1+ " and "+ num2 +" is :"+(num1+num2));
        }else if(operator=='-'){
            System.out.print("Difference of "+num1+ " and "+ num2 +" is :"+(num1-num2));
        }else if(operator=='/'){
            System.out.print("Division of "+num1+ " and "+ num2 +" is :"+(num1/num2));
        }else if(operator=='*'){
            System.out.print("Product of "+num1+ " and "+ num2 +" is :"+(num1*num2));
        }else{
            System.out.print("Invalid Operator!!");
        }







    }
}
