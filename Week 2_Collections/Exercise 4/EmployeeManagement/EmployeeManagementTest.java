public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();

        // Adding employees
        em.addEmployee(new Employee(1, "Alice", "123 Maple St"));
        em.addEmployee(new Employee(2, "Bob", "456 Oak St"));
        em.addEmployee(new Employee(3, "Charlie", "789 Pine St"));

        // Displaying employees
        System.out.println("Employees in the system:");
        em.displayEmployees();

        // Removing an employee
        em.removeEmployee(2);

        // Displaying employees after removal
        System.out.println("\nEmployees in the system after removing Bob:");
        em.displayEmployees();

        // Updating an employee's address
        em.updateEmployee(3, "1010 Elm St");

        // Displaying employees after update
        System.out.println("\nEmployees in the system after updating Charlie's address:");
        em.displayEmployees();
    }
}
