/*This program is to  allow the user to input his/her age and
 show if the person is eligible to vote. A person who is eligible to vote must be older
  than or equal to 18 years old.
 */

import java.util.Scanner;

public class VoteElligiblity {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();// User enters his/her age
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }



    }

}
