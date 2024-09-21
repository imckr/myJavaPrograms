/**
 * This program calculates the grade of a student based on marks using switch-case statements.
 */
public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 85; // Example marks, you can change this value to test different cases
        char grade;

        // Calculate grade based on marks
        switch (marks / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

        // Output the grade
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}