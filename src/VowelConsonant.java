//This program asks user to input any letter and returns its vowel or consonant status

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any letter in lower case: "); //will help user to make a valid entry
        char b = scanner.next().charAt(0);
        if(b=='a'||b=='A'){
            System.out.print(b+" is an vowel");
        }else if(b=='e'||b=='E'){
            System.out.print(b+" is an vowel");
        }else if(b=='i'||b=='I'){
            System.out.print(b+" is an vowel");
        }else if(b=='o'||b=='O'){
            System.out.print(b+" is an vowel");
        }else if(b=='u'||b=='U'){
            System.out.print(b+" is an vowel");
        }else{
            System.out.print(b+" is a consonant");
        }


    }
}
