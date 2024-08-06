import java.util.TreeMap;

public class CustomerAccounts {
    private TreeMap<Integer, Customer> accounts;

    public CustomerAccounts() {
        accounts = new TreeMap<>();
    }

    public void addCustomer(Customer customer) {
        accounts.put(customer.getId(), customer);
    }

    public void removeCustomer(int customerId) {
        accounts.remove(customerId);
    }

    public void displayCustomers() {
        for (Customer customer : accounts.values()) {
            System.out.println(customer);
        }
    }
}
