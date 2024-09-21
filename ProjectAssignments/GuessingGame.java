import java.util.Random;
import java.util.Scanner;

/**
 * This class represents a number guessing game.
 * The program generates a random number between 1 and 100,
 * and the user has to guess it within a certain number of attempts.
 */
public class GuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        
        // Define the maximum number of attempts
        int maxAttempts = 10;
        
        // Variable to store the user's guess
        int userGuess = 0;
        
        // Variable to track the number of attempts
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        // Loop until the user has used all attempts or guessed the number
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
        
        if (userGuess != randomNumber) {
            System.out.println("Sorry! You've used all your attempts. The number was " + randomNumber + ".");
        }
        
        // Close the scanner
        scanner.close();
    }
}