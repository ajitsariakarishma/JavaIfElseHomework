//This program allows user to enter any value and the ﬁnd out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;


public class LetterNumberSymbol {

    public static void AlternateMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character ");

        char b = scanner.next().charAt(0);
        if(b>=97&&b<=122|| b>=65&&b<=90){
            //ASCII value of a to z is 97 to 122 and that od A to Z is 65 to 90
            System.out.print(b+" is a letter");
        } else if (b >= 48 && b <= 57) {
            //ASCII valur of numbers 0 to 9 is 48 to 57
            System.out.print(b+" is a number");
        }else{
            System.out.print(b+" is a symbol");
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character ");

        char b = scanner.next().charAt(0);
        if(b>='a'&&b<='z'|| b>='A'&&b<='Z'){
        System.out.print(b+" is a letter");
        } else if (b >= '0' && b <= '9') {
        System.out.print(b+" is a number");
        }else{
            System.out.print(b+" is a symbol");
        }


        }
    }


