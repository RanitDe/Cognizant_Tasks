import java.util.Scanner;

public class NoteApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name to save the note: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter your note: ");
        String note = scanner.nextLine();

        // Save the note to a file
        FileWriterDemo.saveNoteToFile(fileName, note);

        // Read the note from the file
        FileReaderDemo.readNoteFromFile(fileName);

        scanner.close();
    }
}
