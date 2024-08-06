import java.util.Hashtable;

public class ContactManagement {
    private Hashtable<Integer, Contact> contacts;

    public ContactManagement() {
        contacts = new Hashtable<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
    }

    public void removeContact(int contactId) {
        contacts.remove(contactId);
    }

    public void displayContacts() {
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }
}
