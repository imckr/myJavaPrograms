/**
 * The Rectangle class represents a rectangle shape with a width and height.
 * It provides methods to calculate the area and perimeter of the rectangle.
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Constructs a new Rectangle with the specified width and height.
     *
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getters and setters for width and height
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        // Example usage
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}