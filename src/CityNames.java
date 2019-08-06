
/*This program  is to input any alphabet from a to f and print their city name
accordingly , any other alphabet should be invalid entry
 */


import java.util.Scanner;

public class CityNames {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  //object of Scanner class to enable user input
        System.out.print("Enter any letter in lowercase: ");
        char letter = scanner.next().charAt(0); //User enters a letter
        if(letter =='a'|| letter =='A'){
            System.out.print("Name of the city starting with " +letter+ " is Ahmedabad");
        }else if(letter=='b'||letter == 'B'){
            System.out.print("Name of the city starting with " +letter+ " is Bangkok");
        }else if(letter=='c'||letter == 'C'){
            System.out.print("Name of the city starting with " +letter+ " is Cardiff");
        }else if(letter=='d'||letter == 'D'){
            System.out.print("Name of the city starting with " +letter+ " is Dartford");
        } else if (letter == 'e'|| letter == 'E') {
            System.out.print("Name of the city starting with " +letter+ " is Edinburgh");
        }else if(letter=='f' || letter == 'F'){
            System.out.print("Name of the city starting with " +letter+ " is Florence");
        }else{
            System.out.print("Invalid Entry!");
        }
        }


    }

