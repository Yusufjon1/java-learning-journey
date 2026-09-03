package Lesson3;

import java.util.Scanner;

public class SwitchCaseST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("No idea");


                // Java 8 String case, enum case

                Scanner Days = new Scanner(System.in);
                String day = "Monday";
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                        System.out.println("Week day");
                        break;
                    case "Sunday":
                        System.out.println("Weekend");
                        break;
                    default:
                        System.out.println("No idea");
                }
                // java 12,  ->, java 14
                Scanner scanner1 = new Scanner(System.in);
                int number1 = scanner1.nextInt();
                switch (number1) {
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    default -> System.out.println("No idea");
                }
                Scanner scanner3 = new Scanner(System.in);
                int number3 = scanner.nextInt();
                String a = switch (number3) {
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    default -> "No idea";
                };
                System.out.println(a);

                // java 17 supports null cases and value can not be long, float, double, boolean.

                Scanner numbers = new Scanner(System.in);
                System.out.print("text between 1 and 7: ");
                int weekday = numbers.nextInt();
                switch (weekday) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("No idea");
                        break;
                }

                Scanner rate = new Scanner(System.in);
                System.out.print("your notes 1 till 5: ");
                int note = rate.nextInt();
                switch (note) {
                    case 1:
                        System.out.println("very bad");
                        break;
                    case 2:
                        System.out.println("bad");
                        break;
                    case 3:
                        System.out.println("not bad");
                        break;
                    case 4:
                        System.out.println("good");
                        break;
                    case 5:
                        System.out.println("awesome");
                        break;
                    default:
                        System.out.println("No idea");
                        break;
                }

                Scanner season = new Scanner(System.in);
                System.out.print("Enter the number of the month here: ");
                int numbers4 = season.nextInt();
                switch (numbers4) {
                    case 12, 1, 2 -> System.out.println("Winter");
                    case 3, 4, 5 -> System.out.println("Spring");
                    case 6, 7, 8 -> System.out.println("Summer");
                    case 9, 10, 11 -> System.out.println("Autumn");
                    default -> System.out.println("No more seasons");
                }

                Scanner season1 = new Scanner(System.in);
                System.out.println("Enter the number of the month: ");
                int number4 = season1.nextInt();
                switch (number4) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("these month has 31 days");
                    case 4, 6, 9, 11 -> System.out.println("this month has 30 days");
                    case 2 -> System.out.println("This month has either 28 or 29 days");
                    default -> System.out.println("Contact the support please");
                }

                Scanner nb1 = new Scanner(System.in);
                System.out.print("Enter the numbers please: ");
                int words = nb1.nextInt();
                if (words < 100 || words > 999) {
                    System.out.println("Please enter the right number");
                    return;
                }
                int hundred = words / 100;
                int ten = (words % 100) / 10;
                int one = words % 10;

                String result1 = "";

                switch (hundred) {
                    case 1 -> result1 += "one hundred ";
                    case 2 -> result1 += "two hundred ";
                    case 3 -> result1 += "three hundred ";
                    case 4 -> result1 += "four hundred ";
                    case 5 -> result1 += "five hundred ";
                    case 6 -> result1 += "six hundred ";
                    case 7 -> result1 += "seven hundred ";
                    case 8 -> result1 += "eight hundred ";
                    case 9 -> result1 += "nine hundred ";
                }
                switch (ten) {
                    case 1 -> result1 += "ten ";
                    case 2 -> result1 += "twenty ";
                    case 3 -> result1 += "thirty ";
                    case 4 -> result1 += "forty ";
                    case 5 -> result1 += "fifty ";
                    case 6 -> result1 += "sixty ";
                    case 7 -> result1 += "seventy ";
                    case 8 -> result1 += "eighty ";
                    case 9 -> result1 += "ninety ";
                }
                switch (one) {
                    case 1 -> result1 += "one";
                    case 2 -> result1 += "two";
                    case 3 -> result1 += "three";
                    case 4 -> result1 += "four";
                    case 5 -> result1 += "five";
                    case 6 -> result1 += "six";
                    case 7 -> result1 += "seven";
                    case 8 -> result1 += "eight";
                    case 9 -> result1 += "nine";
                }
                System.out.println(words + " - '" + result1.trim() + "'");


        }

    }
}
