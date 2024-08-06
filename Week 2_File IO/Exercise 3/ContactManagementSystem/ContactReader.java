import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ContactReader {

    public static Contact readContact(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Contact) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the contact.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Class casting issue.");
            e.printStackTrace();
        }
        return null;
    }
}
