import java.util.Scanner;

// This program is for calculating gross salary
public class CalculatingGrossSalary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// object for Scanner class
        System.out.print(" Enter Employee ID: ");
        String emp_id = scanner.next();// user enters emp id which can be combination of characters
        System.out.print(" Enter Employee Name: ");
        String emp_name = scanner.next();
        System.out.print(" Enter Employee Basic Salary: $");
        double basic_salary = scanner.nextDouble();
        double HRA = (basic_salary*10/100);// 10% of basic salary
        double DA = (basic_salary*8/100);// 8% of basic salary
        double TA = (basic_salary*9/100);// 9% of basic salary
        double PF = (basic_salary*20/100);// 20% of basic salary
        double gross_salary = (basic_salary+HRA+DA+TA-PF);// PF is deducted
        System.out.println(" Your HRA is: $"+HRA);
        System.out.println(" Your DA is: $"+DA);
        System.out.println(" Your TA is: $"+TA);
        System.out.println(" Your PF is: $"+PF);
        System.out.println(" Your Gross salary: $"+gross_salary);// Final salary



    }
}
