import java.util.TreeSet;

public class UserRegistration {
    private TreeSet<String> users;

    public UserRegistration() {
        users = new TreeSet<>();
    }

    // Method to register a user
    public void registerUser(String userName) {
        if (users.add(userName)) {
            System.out.println(userName + " has been registered.");
        } else {
            System.out.println(userName + " is already registered.");
        }
    }

    // Method to remove a user
    public void removeUser(String userName) {
        if (users.remove(userName)) {
            System.out.println(userName + " has been removed.");
        } else {
            System.out.println(userName + " is not registered.");
        }
    }

    // Method to display all registered users in alphabetical order
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            System.out.println("Registered users in alphabetical order:");
            for (String user : users) {
                System.out.println(user);
            }
        }
    }
}
