public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        try {
            // ArithmeticException example
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException example
            int[] array = {1, 2, 3};
            int value = array[5]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}