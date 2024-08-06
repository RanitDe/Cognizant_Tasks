import java.util.ArrayList;

public class EmployeeManagement {
    private ArrayList<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int employeeId) {
        employees.removeIf(employee -> employee.getId() == employeeId);
    }

    public void updateEmployee(int employeeId, String newAddress) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employee.setAddress(newAddress);
                break;
            }
        }
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
