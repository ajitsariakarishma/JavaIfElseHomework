//This program allows user to enter any value and the ﬁnd out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class LetterNumberSymbol {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character ");
        char b = scanner.next().charAt(0);//user enters a character
        int i = (int)b;

        if(i>=65&& b<=90||b>=97&& b<=122){
            System.out.print(b+" is a letter ");
        }else if(b>48&& b<=57){
            System.out.print(b+" is a number ");
        }else{
            System.out.print(b+" is a symbol ");
        }


    }
}
