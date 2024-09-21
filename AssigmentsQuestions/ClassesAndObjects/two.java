/**
 * The Student class represents a student with a name, roll number, and marks.
 * It provides methods to calculate the average marks and display student details.
 */
public class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    /**
     * Constructor to initialize the Student object.
     *
     * @param name      the name of the student
     * @param rollNumber the roll number of the student
     * @param marks     the marks of the student
     */
    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    /**
     * Method to calculate the average marks of the student.
     *
     * @return the average marks
     */
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    /**
     * Method to display the details of the student.
     */
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Average Marks: " + calculateAverage());
    }

    public static void main(String[] args) {
        double[] marks = {85.5, 90.0, 78.5};
        Student student = new Student("John Doe", 123, marks);
        student.displayDetails();
    }
}