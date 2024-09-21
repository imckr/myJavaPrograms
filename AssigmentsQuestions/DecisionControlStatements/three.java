import java.util.Scanner;

/**
 * This program checks if a given year is a leap year or not.
 * A leap year is exactly divisible by 4 except for century years (years ending with 00).
 * The century year is a leap year only if it is perfectly divisible by 400.
 */
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Year is divisible by 100, check if it is also divisible by 400
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}