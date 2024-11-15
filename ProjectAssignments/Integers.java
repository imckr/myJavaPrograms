import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        System.out.println("Enter a number to search:");
        if (scanner.hasNextInt()) {
            int searchNumber = scanner.nextInt();
            int index = Collections.binarySearch(numbers, searchNumber);
            if (index >= 0) {
                System.out.println("Number found at index: " + index);
            } else {
                System.out.println("Number not found.");
            }
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
