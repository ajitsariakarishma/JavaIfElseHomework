/*This program is to allows the user to enter number btw 1to7 and display name of the day
accordingly and gives an error alert in case of invaild entry
 */

import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number from 0 to 7 of your choice: ");// to help user to make a valid entry
        int day = scanner.nextInt();//User enters the number
        if(day==1){
            System.out.println(day+" = Sunday ");
        }else if(day==2){
            System.out.println(day+" = Monday ");
        }else if(day==3){
            System.out.println(day+" = Tuesday ");
        }else if(day==4){
            System.out.println(day+" = Wednesday ");
        }else if(day==5){
            System.out.println(day+" = Thrusday ");
        }else if(day==6){
            System.out.println(day+" = Friday ");
        }else if(day==7){
            System.out.println(day+" = Saturday ");
        }else{
            System.out.println("Invalaid Entry!!");
        }



    }
}
