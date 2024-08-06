import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryCopy {

    public static void copyDirectory(Path sourceDir, Path targetDir) {
        try {
            Files.walkFileTree(sourceDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    Path targetPath = targetDir.resolve(sourceDir.relativize(dir));
                    if (!Files.exists(targetPath)) {
                        Files.createDirectory(targetPath);
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.copy(file, targetDir.resolve(sourceDir.relativize(file)));
                    return FileVisitResult.CONTINUE;
                }
            });
            System.out.println("Directory copied from " + sourceDir + " to " + targetDir);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the directory.");
            e.printStackTrace();
        }
    }
}
