import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BackupApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for source and target directories
        System.out.println("Enter the source directory:");
        String sourceDirStr = scanner.nextLine();
        System.out.println("Enter the target directory:");
        String targetDirStr = scanner.nextLine();

        Path sourceDir = Paths.get(sourceDirStr);
        Path targetDir = Paths.get(targetDirStr);

        // Backup all files and directories from source to target
        DirectoryCopy.copyDirectory(sourceDir, targetDir);

        // Demonstrate error handling by attempting to copy to a read-only directory or a directory with insufficient space
        System.out.println("Attempting to copy to a non-existent directory:");
        DirectoryCopy.copyDirectory(sourceDir, Paths.get("non_existent_directory"));

        System.out.println("Attempting to copy to a read-only directory:");
        // Create a read-only directory for demonstration, assuming /read_only_directory is read-only
        DirectoryCopy.copyDirectory(sourceDir, Paths.get("/read_only_directory"));
        
        scanner.close();
    }
}
