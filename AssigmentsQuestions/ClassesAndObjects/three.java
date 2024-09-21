/**
 * The Complex class represents a complex number and provides methods
 * for addition and subtraction of complex numbers.
 */ 
public class Complex {
    private double real;
    private double imaginary;

    /**
     * Constructs a new Complex number with the specified real and imaginary parts.
     *
     * @param real the real part of the complex number
     * @param imaginary the imaginary part of the complex number
     */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Adds this complex number to another complex number.
     *
     * @param other the complex number to be added
     * @return a new Complex number which is the sum of this and the other complex number
     */
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    /**
     * Subtracts another complex number from this complex number.
     *
     * @param other the complex number to be subtracted
     * @return a new Complex number which is the difference between this and the other complex number
     */
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    /**
     * Returns a string representation of this complex number.
     *
     * @return a string representation of this complex number
     */
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(2.0, 3.0);
        Complex num2 = new Complex(1.5, 2.5);

        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}