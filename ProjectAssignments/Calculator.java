import java.util.Scanner;

// package ProjectAssignments;

/**
 * Calculator class to perform basic arithmetic operations and calculate area and volume of shapes.
 */
public class Calculator {

    /**
     * Adds two integers.
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second integer from first integer.
     * @param a First integer
     * @param b Second integer
     * @return Difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a First integer
     * @param b Second integer
     * @return Product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides first integer by second integer.
     * @param a First integer
     * @param b Second integer
     * @return Quotient of a and b
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    /**
     * Calculates the area of a rectangle.
     * @param length Length of the rectangle
     * @param width Width of the rectangle
     * @return Area of the rectangle
     */
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the area of a circle.
     * @param radius Radius of the circle
     * @return Area of the circle
     */
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the volume of a cuboid.
     * @param length Length of the cuboid
     * @param width Width of the cuboid
     * @param height Height of the cuboid
     * @return Volume of the cuboid
     */
    public double calculateCuboidVolume(double length, double width, double height) {
        return length * width * height;
    }

    /**
     * Calculates the volume of a sphere.
     * @param radius Radius of the sphere
     * @return Volume of the sphere
     */
    public double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Calculate Rectangle Area");
            System.out.println("6. Calculate Circle Area");
            System.out.println("7. Calculate Cuboid Volume");
            System.out.println("8. Calculate Sphere Volume");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int addA = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int addB = scanner.nextInt();
                    System.out.println("Result: " + calculator.add(addA, addB));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int subA = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int subB = scanner.nextInt();
                    System.out.println("Result: " + calculator.subtract(subA, subB));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int mulA = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int mulB = scanner.nextInt();
                    System.out.println("Result: " + calculator.multiply(mulA, mulB));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int divA = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int divB = scanner.nextInt();
                    try {
                        System.out.println("Result: " + calculator.divide(divA, divB));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter length: ");
                    double rectLength = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double rectWidth = scanner.nextDouble();
                    System.out.println("Result: " + calculator.calculateRectangleArea(rectLength, rectWidth));
                    break;
                case 6:
                    System.out.print("Enter radius: ");
                    double circleRadius = scanner.nextDouble();
                    System.out.println("Result: " + calculator.calculateCircleArea(circleRadius));
                    break;
                case 7:
                    System.out.print("Enter length: ");
                    double cuboidLength = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double cuboidWidth = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double cuboidHeight = scanner.nextDouble();
                    System.out.println("Result: " + calculator.calculateCuboidVolume(cuboidLength, cuboidWidth, cuboidHeight));
                    break;
                case 8:
                    System.out.print("Enter radius: ");
                    double sphereRadius = scanner.nextDouble();
                    System.out.println("Result: " + calculator.calculateSphereVolume(sphereRadius));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
