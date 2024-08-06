import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopy {

    public static void copyFile(Path source, Path target) {
        try {
            Files.copy(source, target);
            System.out.println("File copied from " + source + " to " + target);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
