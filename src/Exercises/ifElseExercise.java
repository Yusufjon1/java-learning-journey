package Exercises;

import java.util.Scanner;

public class ifElseExercise {
    public static void main(String[] args) {

        int totalPrice = 0;
        do {
            int age = survey("Please enter the age of people: ");
            int count = survey("Please enter the number of tickets: ");
            totalPrice = prices(age, count);
            if (totalPrice == -1) {
                System.out.println("Please enter the right number");
            }
        } while (totalPrice == -1);
        System.out.println("overall price is " + totalPrice);


       /*

        do {
            month = month("Please enter the month in numbers: ");
            if (month <= 0 || month > 12) {
                System.out.println("Please enter the valid month");
            }
        }while (month <= 0 || month > 12);
        System.out.println("Today is " + month + " this month"); */



      /*  int gymSurvey = getUserInput("Enter the months you want to join: ");
        int gymPrice = gymMonths(gymSurvey);

        if (gymPrice == -1) {
            System.out.println("Wrong month entered");
        } else if (gymPrice == 0) {
            System.out.println("The length of month has not chosen");
        } else {
            System.out.println("The monthly fee is " + gymPrice);
        } */

    }
    
   /* static int gymMonths (int months) {
        if (months < 0) {
            return -1;
        } else if (months == 0) {
            return 0;
        } else if (months <= 3) {
            return 50;
        } else if (months <= 6) {
            return 90;
        } else if (months <= 12) {
            return 160;
        } else {
            return -1;
        }
    } */

  /*  static int getUserInput (String gym) {
        Scanner survey = new Scanner(System.in);
        System.out.print(gym);
        return survey.nextInt();
    } */


    /*  static int month (String survey) {
          Scanner scanner = new Scanner(System.in);
          System.out.print(survey);
          return scanner.nextInt();
      } */

    static int survey(String ask) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print(ask);
        return scanner1.nextInt();
    }

    static int prices(int age, int count) {
        if (age < 0 || age > 120 || count <= 0) {
            return -1;
        }
        int singlePrice = 0;
         if (age <= 12) {
            singlePrice = 5;
        } else if (age <= 60) {
            singlePrice = 10;
        } else {
            singlePrice =  7;
        }
            return singlePrice * count;
        }
    }
