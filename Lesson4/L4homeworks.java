package Lesson4;

import java.util.Scanner;

public class L4homeworks {
    public static void main(String[] args) {

       /* int num1 =  getuserInput("Enter the first number: ");
        int num2 = getuserInput("Enter the second number: ");

        int result = addTwoNumbers (num1, num2);
        System.out.println("Result: " + result); */

      /*  int numb1 = hw2("Enter the first number: ");
        int numb2 = hw2("Enter the second number: ");

        int result2 = doubleTheNumbers(numb1, numb2);
        System.out.println("Result: " + result2); */

      /*  int numb3 = hw3("Enter the number: ");
        int result3 = tripleNumber(numb3);
        System.out.println("Cube is: " + result3); */

     /*  int nmm = hw4("Enter the factorial number: ");
        long result4 = factorial(nmm);
        System.out.println(nmm + "! = " + result4); */

       /* int exp = power1("Enter the base: ");
        int exp1 = power1("Enter the exponent: ");

        long result5 = power(exp, exp1);
        System.out.println(exp + " ^ " + exp1 + " = " + result5); */

        int n5 = numbers33("Enter the fibonacci level: ");
        long result6 = fibonacci(n5);
        System.out.println("the result is " + result6);
    }

    /* static int addTwoNumbers(int a, int b) {
        return a + b;
     }


    static int getuserInput(String survey) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(survey);
        return scanner.nextInt();
    } */


  /*  static int hw2(String sv) {
        Scanner double1 = new Scanner(System.in);
        System.out.print(sv);
        return double1.nextInt();
    } */

    /* static int doubleTheNumbers(int x, int y) {
        return x * y;
    } */

   /* static int hw3 (String cube) {
        Scanner triple = new Scanner(System.in);
        System.out.println(cube);
        return triple.nextInt();
    }

    static int tripleNumber (int a1) {
        return a1 * a1 * a1;
    } */

   /* static int hw4 (String nmbr) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(nmbr);
        return userInput.nextInt();
    }
    static long factorial (int n1) {
        if (1 >= n1) {
            return 1;
        }
        return n1 * factorial(n1 - 1);
    } */
       /* static int power1 (String nmbrs2) {
            Scanner scanning = new Scanner(System.in);
            System.out.print(nmbrs2);
            return scanning.nextInt();
       }
       static long power (int base, int exponent) {
            if (exponent == 1) {
                return 1;
            }
            return base * power(base, exponent -1);
       } */
    static int numbers33 (String hint11) {
        Scanner scan2 = new Scanner(System.in);
        System.out.print(hint11);
        return scan2.nextInt();
    }
    static long fibonacci (int n4) {
        if (n4 <= 0) {
            return 0;
        }
        if (n4 == 1) {
            return 1;
        }
        return fibonacci(n4 - 1) + fibonacci(n4 - 2);
    }





}
