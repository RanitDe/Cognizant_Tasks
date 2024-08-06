import java.util.List;

public class FileProcessorApp {

    public static void main(String[] args) {
        String inputFileName = "large_sales_data.txt";
        String outputFileName = "processed_sales_data.txt";

        // Read the large sales data file
        List<String> salesData = LargeFileReader.readLargeFile(inputFileName);

        // Process the data (e.g., filtering records, calculating totals)
        // Here we are simply passing the read data as processed data for demonstration
        List<String> processedData = salesData; // Replace this with actual processing logic

        // Write the processed data to a new file
        LargeFileWriter.writeProcessedData(outputFileName, processedData);

        // Demonstrate error handling by attempting to read from a non-existent file
        LargeFileReader.readLargeFile("non_existent_file.txt");

        // Demonstrate error handling by attempting to write to a restricted directory
        LargeFileWriter.writeProcessedData("/restricted_directory/processed_data.txt", processedData);
    }
}
