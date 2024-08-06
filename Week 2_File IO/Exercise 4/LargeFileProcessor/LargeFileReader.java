import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeFileReader {

    public static List<String> readLargeFile(String inputFileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            System.out.println("Reading large file:");
            while ((line = reader.readLine()) != null) {
                // Process each line (e.g., parse and print sales records)
                lines.add(line);
                System.out.println(line); // You can customize this to parse and process the line as needed
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return lines;
    }
}
