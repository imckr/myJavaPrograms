import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentRegSys {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            while (true) {
                System.out.println("1. Register Student");
                System.out.println("2. Update Student Profile");
                System.out.println("3. View Student Details");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        registerStudent(connection, scanner);
                        break;
                    case 2:
                        updateStudentProfile(connection, scanner);
                        break;
                    case 3:
                        viewStudentDetails(connection, scanner);
                        break;
                    case 4:
                        connection.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void registerStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, email);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new student was registered successfully!");
        }
    }

    private static void updateStudentProfile(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new student email: ");
        String email = scanner.nextLine();

        String sql = "UPDATE students SET name = ?, email = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, email);
        statement.setInt(3, id);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Student profile updated successfully!");
        }
    }

    private static void viewStudentDetails(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM students WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            System.out.println("Student ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } else {
            System.out.println("Student not found.");
        }
    }
}