public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration userReg = new UserRegistration();

        // Register users
        userReg.registerUser("Alice");
        userReg.registerUser("Bob");
        userReg.registerUser("Charlie");
        userReg.registerUser("Alice"); // Duplicate

        // Display users
        userReg.displayUsers();

        // Remove a user
        userReg.removeUser("Bob");

        // Display users again
        userReg.displayUsers();

        // Try to remove a non-existing user
        userReg.removeUser("Daniel");

        // Display users one more time
        userReg.displayUsers();
    }
}
