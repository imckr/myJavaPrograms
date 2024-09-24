import java.util.Scanner;

/**
 * This program calculates the factorial of a number using both for and while loops.
 */
public class FactorialGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating factorial using for loop
        long factorialFor = factorialUsingForLoop(number);
        System.out.println("Factorial of " + number + " using for loop is: " + factorialFor);

        // Calculating factorial using while loop
        long factorialWhile = factorialUsingWhileLoop(number);
        System.out.println("Factorial of " + number + " using while loop is: " + factorialWhile);
        scanner.close();
    }

    /**
     * Calculates the factorial of a number using a for loop.
     *
     * @param number the number to calculate the factorial of
     * @return the factorial of the number
     */
    public static long factorialUsingForLoop(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calculates the factorial of a number using a while loop.
     *
     * @param number the number to calculate the factorial of
     * @return the factorial of the number
     */
    public static long factorialUsingWhileLoop(int number) {
        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}