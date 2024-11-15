import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class StoredProcedure {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/yourDatabase";
        String username = "yourUsername";
        String password = "yourPassword";

        Connection connection = null;
        CallableStatement callableStatement = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(jdbcURL, username, password);

            // Prepare the stored procedure call
            String sql = "{call yourStoredProcedureName(?, ?)}";
            callableStatement = connection.prepareCall(sql);

            // Set input parameters if any
            callableStatement.setInt(1, 123);
            callableStatement.setString(2, "example");

            // Execute the stored procedure
            callableStatement.execute();

            System.out.println("Stored procedure executed successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (callableStatement != null) {
                    callableStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}