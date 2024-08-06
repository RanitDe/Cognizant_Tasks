public class ContactApp {

    public static void main(String[] args) {
        String fileName = "contact.ser";
        
        // Create a Contact object
        Contact contact = new Contact("John Barrack", "+919456297816", "john.barrack@gmail.com");
        
        // Save the Contact object to a file
        ContactWriter.saveContact(fileName, contact);
        
        // Read the Contact object back from the file
        Contact readContact = ContactReader.readContact(fileName);
        if (readContact != null) {
            System.out.println("Read contact: " + readContact);
        }

        // Demonstrate error handling by attempting to read from a non-existent file
        ContactReader.readContact("non_existent_file.ser");
    }
}
