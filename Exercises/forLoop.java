package Exercises;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

       /* int totalMonths = 6;              // FIRST TASK
        int monthlyTarget = 500;
        int successfulMonths = 0;
        int totalSales = 0;

        for (int i = 1; i <= totalMonths; i++) {
            int monthlySales = getUserInput("Please enter the monthly sales: ");
            totalSales += monthlySales;
            if (monthlySales >= monthlyTarget) {
                System.out.println("Status: Target Reached! Great job!");
                successfulMonths++;
            } else {
                System.out.println("Status: Target Missed! Needs improvement.");
            }

        }
        System.out.println("Total sales for 6 months: " + totalSales);
        System.out.println("Successful months: " + successfulMonths + " out of 6 "); */


        int totalDays = 7;
        int totalEnergy = 0;
        int maxEnergy = 0;
        int peakDay = 0;

        for (int i = 1; i <= totalDays ; i++) {
            int dailyConsumption = getUserInput2("Enter energy consumption for day #" + i + " (kWh): ");
            totalEnergy += dailyConsumption;
            if (dailyConsumption > maxEnergy) {
                maxEnergy = dailyConsumption;
                peakDay = i;
            }

        }
        System.out.println("Total energy consumed for the week: " + totalEnergy + " kWh");
        System.out.println("Peak consumption was on Day " + peakDay + " with " + maxEnergy + " kWh ");
    }


   /* static int getUserInput(String survey) {               // FIRST TASK
        Scanner scanner = new Scanner(System.in);
        System.out.print(survey);
        return scanner.nextInt();
    } */


    static int getUserInput2 (String survey2) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print(survey2);
        return scanner2.nextInt();
    }
}
