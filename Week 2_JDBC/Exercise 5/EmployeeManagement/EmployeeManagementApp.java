import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagementApp {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            // Display the menu
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    updateEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    viewEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        EmployeeDataRetrieval.addEmployee(name, position, salary);
    }

    private static void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter new employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new employee position: ");
        String position = scanner.nextLine();
        System.out.print("Enter new employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        EmployeeDataRetrieval.updateEmployee(id, name, position, salary);
    }

    private static void deleteEmployee() {
        System.out.print("Enter employee ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        EmployeeDataRetrieval.deleteEmployee(id);
    }

    private static void viewEmployees() {
        System.out.println("Employee Records:");
        EmployeeDataRetrieval.getEmployees();
    }
}
