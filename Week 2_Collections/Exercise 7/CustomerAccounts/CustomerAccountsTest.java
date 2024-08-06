public class CustomerAccountsTest {
    public static void main(String[] args) {
        CustomerAccounts customerAccounts = new CustomerAccounts();

        // Adding customers
        customerAccounts.addCustomer(new Customer(1, "Alice", "alice57@gmail.com"));
        customerAccounts.addCustomer(new Customer(3, "Charlie", "charlie23@hotmail.com"));
        customerAccounts.addCustomer(new Customer(2, "Bob", "bob21@outlook.com"));

        // Displaying customers
        System.out.println("Customer accounts:");
        customerAccounts.displayCustomers();

        // Removing a customer
        customerAccounts.removeCustomer(2);

        // Displaying customers after removal
        System.out.println("\nCustomer accounts after removing Bob:");
        customerAccounts.displayCustomers();
    }
}
