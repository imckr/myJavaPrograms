import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLQuery {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/yourDatabaseName";
        String username = "yourUsername";
        String password = "yourPassword";
        String query = "SELECT * FROM yourTableName";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            // Creating a statement
            Statement statement = connection.createStatement();
            // Executing the query
            ResultSet resultSet = statement.executeQuery(query);

            // Processing the result set
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("column1Name"));
                System.out.println("Column2: " + resultSet.getString("column2Name"));
                // Add more columns as needed
            }

            // Closing the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}