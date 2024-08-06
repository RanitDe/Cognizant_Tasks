import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Optional;
import java.util.stream.Collectors;

public class SalesAnalysis {
    public static void main(String[] args) {
        // Create a list of SalesRecord objects with sample data
        List<SalesRecord> salesRecords = new ArrayList<>();
        salesRecords.add(new SalesRecord("1", "Alice", "North", 1000.0, LocalDate.of(2023, 1, 10), "Electronics", 5));
        salesRecords.add(new SalesRecord("2", "Bob", "South", 1500.0, LocalDate.of(2023, 1, 15), "Furniture", 3));
        salesRecords.add(new SalesRecord("3", "Charlie", "North", 2000.0, LocalDate.of(2023, 1, 20), "Electronics", 7));
        salesRecords.add(new SalesRecord("4", "Alice", "West", 2500.0, LocalDate.of(2023, 1, 25), "Books", 10));
        salesRecords.add(new SalesRecord("5", "Bob", "North", 3000.0, LocalDate.of(2023, 1, 30), "Electronics", 2));

        // Filter sales records for a specific product category and sort them by date
        String productCategory = "Electronics";
        List<SalesRecord> filteredAndSortedRecords = salesRecords.stream()
                .filter(record -> record.getProductCategory().equals(productCategory))
                .sorted(Comparator.comparing(SalesRecord::getDate))
                .collect(Collectors.toList());
        System.out.println("Filtered and Sorted Records:");
        filteredAndSortedRecords.forEach(System.out::println);

        // Calculate the average sales amount for a specific region
        String region = "North";
        OptionalDouble averageSales = salesRecords.stream()
                .filter(record -> record.getRegion().equals(region))
                .mapToDouble(SalesRecord::getAmount)
                .average();
        System.out.println("Average Sales Amount in North region: " + (averageSales.isPresent() ? averageSales.getAsDouble() : "No records"));

        // Find the sales record with the highest amount
        Optional<SalesRecord> topSalesRecord = salesRecords.stream()
                .max(Comparator.comparingDouble(SalesRecord::getAmount));
        System.out.println("Top Sales Record: " + (topSalesRecord.isPresent() ? topSalesRecord.get() : "No records"));

        // Perform the filtering and sorting operations using parallel streams for improved performance
        long startTime = System.nanoTime();
        List<SalesRecord> parallelFilteredAndSortedRecords = salesRecords.parallelStream()
                .filter(record -> record.getProductCategory().equals(productCategory))
                .sorted(Comparator.comparing(SalesRecord::getDate))
                .collect(Collectors.toList());
        long endTime = System.nanoTime();
        System.out.println("Parallel Filtered and Sorted Records:");
        parallelFilteredAndSortedRecords.forEach(System.out::println);
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " nanoseconds");

        // Perform the same operation using sequential streams for comparison
        startTime = System.nanoTime();
        List<SalesRecord> sequentialFilteredAndSortedRecords = salesRecords.stream()
                .filter(record -> record.getProductCategory().equals(productCategory))
                .sorted(Comparator.comparing(SalesRecord::getDate))
                .collect(Collectors.toList());
        endTime = System.nanoTime();
        System.out.println("Sequential Filtered and Sorted Records:");
        sequentialFilteredAndSortedRecords.forEach(System.out::println);
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " nanoseconds");
    }
}
