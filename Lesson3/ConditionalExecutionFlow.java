package Lesson3;

import java.util.Scanner;

public class ConditionalExecutionFlow {
    public static void main(String[] args) {
        Scanner survey = new Scanner(System.in);
        System.out.print("How many legs do have a horse? ");
        int userInput = survey.nextInt();
        if (userInput == 4){
            System.out.println("Yes you are right :) 😊");
        }else {
            System.out.println("nope so wrong :( 😒");
        }
        // if one of the statement works that means it is conditional flow
    }
}
