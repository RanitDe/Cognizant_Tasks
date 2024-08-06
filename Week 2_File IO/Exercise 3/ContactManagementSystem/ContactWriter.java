import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ContactWriter {

    public static void saveContact(String fileName, Contact contact) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(contact);
            System.out.println("Contact saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the contact.");
            e.printStackTrace();
        }
    }
}
