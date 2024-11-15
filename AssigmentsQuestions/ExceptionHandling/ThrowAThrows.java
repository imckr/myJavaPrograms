// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowAThrows {
    // Method that throws the custom exception
    public static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is less than 18");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            validate(15); // This will throw the custom exception
        } catch (CustomException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}