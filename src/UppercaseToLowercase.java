import java.util.Scanner;
// This is a program to convert a string and char from uppercase to lowercase
public class UppercaseToLowercase {

    public static void main(String [] args){
       // First converting a string to lower case from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String in uppercase: ");
        String a = scanner.next();
        System.out.println("Lower case of "+ a + " is: "+ a.toLowerCase());
       // Executing the method defined below to convert a char entered in uppercase to lowercase
        char_to_lower_case();
    }
    public static void char_to_lower_case(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter in upper case: ");
        char b = scanner.next().charAt(0);
        int i = (int)b;
        i = i+32;
        b = (char) i;
        System.out.println("Lower case of "+ " is: "+b);



    }
}