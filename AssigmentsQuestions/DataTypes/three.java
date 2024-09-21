/**
 * This program performs arithmetic operations using various data types
 * and demonstrates type casting in Java.
 */
public class TypeCasting {

    public static void main(String[] args) {
        // Integer arithmetic
        int a = 10;
        int b = 3;
        System.out.println("Integer Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Floating-point arithmetic
        double x = 10.5;
        double y = 3.2;
        System.out.println("\nFloating-point Arithmetic:");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // Type casting
        System.out.println("\nType Casting:");
        // Implicit casting (widening conversion)
        int i = 100;
        double d = i; // int to double
        System.out.println("Implicit casting (int to double): " + d);

        // Explicit casting (narrowing conversion)
        double pi = 3.14159;
        int intPi = (int) pi; // double to int
        System.out.println("Explicit casting (double to int): " + intPi);

        // Casting during arithmetic operations
        int result = (int) (a + x); // int + double -> double -> int
        System.out.println("Casting during arithmetic operations (int + double -> int): " + result);
    }
}