import java.util.Scanner;

/**
 * This program prints the Fibonacci series up to a given number.
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number up to which Fibonacci series is to be printed
        System.out.print("Enter the number up to which Fibonacci series is to be printed: ");
        int number = scanner.nextInt();

        // Print the Fibonacci series
        printFibonacciSeries(number);

        scanner.close();
    }

    /**
     * This method prints the Fibonacci series up to the given number.
     *
     * @param number the number up to which Fibonacci series is to be printed
     */
    public static void printFibonacciSeries(int number) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        int next;
        for (int i = 2; i < number; i++) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}