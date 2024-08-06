import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void saveNoteToFile(String fileName, String note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(note);
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the note.");
            e.printStackTrace();
        }
    }
}
