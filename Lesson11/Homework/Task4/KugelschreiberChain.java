package Homework.Task4;

import java.util.Scanner;

public class KugelschreiberChain {
    public static void main(String[] args) {

        Kugelschreiber kugelschreiber = new Kugelschreiber();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity: ");
        kugelschreiber.setQuantity(scanner.nextInt());

        System.out.print("Is pen clicked ? (True/False): ");
        kugelschreiber.setClicked(scanner.nextBoolean());
        scanner.nextLine();

        System.out.print("Enter text to write: ");
        String text = scanner.nextLine();

        kugelschreiber.write(text);
    }
}
