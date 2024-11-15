import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CREDOperation {
    private static final String URL = "jdbc:mysql://localhost:3306/yourDatabase";
    private static final String USER = "yourUsername";
    private static final String PASSWORD = "yourPassword";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Insert a record
            String insertSQL = "INSERT INTO yourTable (column1, column2) VALUES (?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);
            insertStatement.setString(1, "value1");
            insertStatement.setString(2, "value2");
            insertStatement.executeUpdate();

            // Update a record
            String updateSQL = "UPDATE yourTable SET column1 = ? WHERE column2 = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateSQL);
            updateStatement.setString(1, "newValue");
            updateStatement.setString(2, "value2");
            updateStatement.executeUpdate();

            // Delete a record
            String deleteSQL = "DELETE FROM yourTable WHERE column1 = ?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteSQL);
            deleteStatement.setString(1, "value1");
            deleteStatement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}