package Lesson3;

import java.util.Scanner;

public class RepetitionExecutionFlow  {
    public static void main(String[] args) {
        int userInput; // this is repetition execution because it asks repeatedly until gets the true answer
        do {
            Scanner survey = new Scanner(System.in);
            System.out.print("How many legs does have a horse? ");
            userInput = survey.nextInt();
            if (userInput == 4) {
                System.out.println("Yes you are right :) 😊");
            } else {
                System.out.println("nope so wrong :( 😒");
                System.out.println("Try again 😁");
            }
        }while(userInput != 4);


    }
}
