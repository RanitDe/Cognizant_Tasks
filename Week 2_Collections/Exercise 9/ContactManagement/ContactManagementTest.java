public class ContactManagementTest {
    public static void main(String[] args) {
        ContactManagement contactManagement = new ContactManagement();

        // Adding contacts
        contactManagement.addContact(new Contact(1, "Tom", "+917839802564"));
        contactManagement.addContact(new Contact(2, "John", "+919841204322"));
        contactManagement.addContact(new Contact(3, "Katy", "+919530918376"));

        // Displaying contacts
        System.out.println("Contact list:");
        contactManagement.displayContacts();

        // Removing a contact
        contactManagement.removeContact(2);

        // Displaying contacts after removal
        System.out.println("\nContact list after removing John:");
        contactManagement.displayContacts();
    }
}
