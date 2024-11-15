public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Exception caught: Division by zero.");
        } finally {
            // Code that will always execute
            System.out.println("This is the finally block.");
        }
    }
}