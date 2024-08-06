import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";  // Replace with your MySQL username
    private static final String PASSWORD = "password";  // Replace with your MySQL password

    // Method to establish and return a connection
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Load the JDBC driver (optional for newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
            throw e;  // Re-throw the exception to indicate failure
        }
        return connection;
    }

    public static void main(String[] args) {
        // Test the connection
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Connection to the database was successful!");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
