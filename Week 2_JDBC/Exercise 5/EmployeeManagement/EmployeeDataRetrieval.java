import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDataRetrieval {

    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";  // Replace with your MySQL username
    private static final String PASSWORD = "password";  // Replace with your MySQL password

    // Method to establish a connection
    private static Connection getConnection() throws SQLException {
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

    // Method to add a new employee
    public static void addEmployee(String name, String position, double salary) {
        String query = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, position);
            preparedStatement.setDouble(3, salary);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee added successfully.");
            }

        } catch (SQLException e) {
            System.out.println("Error adding employee.");
            e.printStackTrace();
        }
    }

    // Method to update an existing employee
    public static void updateEmployee(int id, String name, String position, double salary) {
        String query = "UPDATE employees SET name = ?, position = ?, salary = ? WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, position);
            preparedStatement.setDouble(3, salary);
            preparedStatement.setInt(4, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee updated successfully.");
            }

        } catch (SQLException e) {
            System.out.println("Error updating employee.");
            e.printStackTrace();
        }
    }

    // Method to delete an employee
    public static void deleteEmployee(int id) {
        String query = "DELETE FROM employees WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee deleted successfully.");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting employee.");
            e.printStackTrace();
        }
    }

    // Method to retrieve and display employee data
    public static void getEmployees() {
        String query = "SELECT * FROM employees";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Display column headers
            System.out.printf("%-5s %-20s %-20s %-10s%n", "ID", "Name", "Position", "Salary");

            // Iterate over the ResultSet to display data
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");

                // Print employee details
                System.out.printf("%-5d %-20s %-20s %-10.2f%n", id, name, position, salary);
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving employee data.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Demonstrate CRUD operations

        // Add employees
        addEmployee("Alice Johnson", "Manager", 75000);
        addEmployee("Bob Smith", "Developer", 55000);
        addEmployee("Carol White", "Analyst", 62000);

        // Update an employee
        updateEmployee(2, "Bob Smith", "Senior Developer", 60000);

        // Delete an employee
        deleteEmployee(3);

        // Retrieve and display all employee records
        System.out.println("Employee Records:");
        getEmployees();
    }
}
