import java.util.Scanner;

/**
 * This program generates a multiplication table for a given number.
 * The number is taken as input from the user.
 */
public class TableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Generate and display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}