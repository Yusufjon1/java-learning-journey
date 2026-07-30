package Exercises;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        int overallPrices2 = 0;          // THIRD TASK
        do {
            int carType = getUserInput3("Select a transport type (1-Car, 2-Truck):");
            int hours = getUserInput3("How many hours will you stay? (1-24):");
            overallPrices2 = parkingFee(carType, hours);
            if (overallPrices2 == -1) {
                System.out.println("Invalid input! The transport type must be between 1 and 2, and the hours between 1 and 24.");
            }
        } while (overallPrices2 == -1);
        System.out.println("Total payment: " + overallPrices2 + " euro");



       /* int overallPrices = 0;                                     // SECOND TASK
        do {
            int package1 = getuserInput2("Please select a tariff (1-Basic, 2-Premium, 3-VIP): ");
            int months = getuserInput2("How many months would you like to subscribe for? (1-12):: ");
            overallPrices = gymPackage(package1, months);
            if (overallPrices == -1) {
                System.out.println("The tariff must be between 1 and 3, and the month between 1 and 12.");
            }
        } while (overallPrices == -1);
        System.out.println("Total payment: " + overallPrices); */



      /*  int totalPrice = 0;                    // FIRST TASK
        do {
            int carType = getUserInput("Please enter the model (1, 2, or 3): ");
            int rent = getUserInput("How many days do you want to rent ? (min: 1 day, max 30 days): ");
            totalPrice = carPrices(carType, rent);
            if (totalPrice == -1) {
                System.out.println("Please enter the right number");
            }
        } while (totalPrice == -1);
        System.out.println("Overall price is: " + totalPrice); */
    }

  /*  static int carPrices(int type, int rent) {                   // FIRST TASK
        if (type > 3 || type <= 0 || rent > 30 || rent <= 0) {
            return -1;
        }
        int eachPrice;
        if (type == 1) {
            eachPrice = 30;
        } else if (type == 2) {
            eachPrice = 60;
        } else {
            eachPrice = 100;
        }
        return eachPrice * rent;
    } */


   /* static int getUserInput(String survey) {                // FIRST TASK
        Scanner scanner = new Scanner(System.in);
        System.out.print(survey);
        return scanner.nextInt();
    } */

   /* static int gymPackage(int package1, int months) {              // SECOND TASK
        if (package1 > 3 || 0 >= package1 || months > 12 || 0 >= months) {
            return -1;
        }
        int eachPrice1 = 0;
        if (package1 == 1) {
            eachPrice1 = 20;
        } else if (package1 == 2) {
            eachPrice1 = 35;
        } else {
            eachPrice1 = 50;
        }
        int total = months * eachPrice1;
        if (months >= 6) {
            total -= 20;
        }
        return total;
    } */


   /* static int getuserInput2(String survey2) {          // SECOND TASK
        Scanner scanner2 = new Scanner(System.in);
        System.out.print(survey2);
        return scanner2.nextInt();
    } */
        
    static int parkingFee (int vehicle, int hours) {                           // THIRD TASK
        int overallMoney = 0;
        if (vehicle > 2 || vehicle <= 0 || hours > 24 || hours < 1) {
            return -1;
        } else if (vehicle == 1) {
            overallMoney = 3;
        } else {
            overallMoney = 6;
        } int totalFee = overallMoney * hours;
        if (hours >= 10) {
           totalFee -= 15;
        }
        return totalFee;
    }


   static int getUserInput3 (String survey3) {                 // THIRD TASK
       Scanner scanner3 = new Scanner(System.in);
       System.out.print(survey3);
       return scanner3.nextInt();
   }

}
