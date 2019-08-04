//This program is to calculale sales commission of a salesman/girl

import java.util.Scanner;

public class SalesmanSalary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// creating object for Scanner class
        System.out.print("Enter Sales ID : ");
        String sales_id = scanner.next(); // User enters sales id which can be combination of characters
        System.out.print("Enter Seller's name : ");
        String seller_name = scanner.next();
        System.out.print("Enter sales amount : $");
        double sales_amt = scanner.nextDouble(); // sales amount can be in decimals hence data type double
        System.out.print("Enter Basic Salary : $");
        double basic_salary = scanner.nextDouble();// user enters basic salary which can be in decimals

        if(sales_amt>=50000){
            double commission = sales_amt*35/100;
            System.out.print("Your commission amount is : $"+commission);
        }else if(sales_amt>=30000){
            double commission = sales_amt*20/100;
            System.out.print("Your commission amount is : $"+commission);
        }else if(sales_amt>=20000){
            double commission = sales_amt*10/100;
            System.out.print("Your commission amount is : $"+commission);
        }else if(sales_amt>=10000){
            double commission = sales_amt*5/100;
            System.out.print("Your commission amount is : $"+commission);
        }else{
            double commission = sales_amt*2/100;
            System.out.print("Your commission amount is : $"+commission);
        }





    }


}
