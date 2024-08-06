import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesAnalysis {
    public static void main(String[] args) {
        // Create a list of SalesRecord objects with sample data
        List<SalesRecord> salesRecords = new ArrayList<>();
        salesRecords.add(new SalesRecord("1", "Alice", "North", 1000.0, LocalDate.of(2023, 1, 10)));
        salesRecords.add(new SalesRecord("2", "Bob", "South", 1500.0, LocalDate.of(2023, 1, 15)));
        salesRecords.add(new SalesRecord("3", "Charlie", "North", 2000.0, LocalDate.of(2023, 1, 20)));
        salesRecords.add(new SalesRecord("4", "Alice", "West", 2500.0, LocalDate.of(2023, 1, 25)));
        salesRecords.add(new SalesRecord("5", "Bob", "North", 3000.0, LocalDate.of(2023, 1, 30)));

        // Filter sales records for a specific region
        String region = "North";
        List<SalesRecord> filteredRecords = salesRecords.stream()
                .filter(record -> record.getRegion().equals(region))
                .collect(Collectors.toList());
        System.out.println("Filtered Records:");
        filteredRecords.forEach(System.out::println);

        // Extract the sales amounts from the filtered records
        List<Double> salesAmounts = filteredRecords.stream()
                .map(SalesRecord::getAmount)
                .collect(Collectors.toList());
        System.out.println("Sales Amounts:");
        salesAmounts.forEach(System.out::println);

        // Calculate the total sales amount for the filtered records
        double totalSales = filteredRecords.stream()
                .mapToDouble(SalesRecord::getAmount)
                .sum();
        System.out.println("Total Sales Amount: " + totalSales);

        // Group sales records by salesPerson
        Map<String, List<SalesRecord>> salesByPerson = salesRecords.stream()
                .collect(Collectors.groupingBy(SalesRecord::getSalesPerson));
        System.out.println("Sales by SalesPerson:");
        salesByPerson.forEach((salesPerson, records) -> {
            System.out.println(salesPerson + ":");
            records.forEach(System.out::println);
        });

        // Generate a sales report that includes the total sales amount for each salesperson
        Map<String, Double> salesReport = salesRecords.stream()
                .collect(Collectors.groupingBy(
                        SalesRecord::getSalesPerson,
                        Collectors.summingDouble(SalesRecord::getAmount)
                ));
        System.out.println("Sales Report:");
        salesReport.forEach((salesPerson, totalAmount) -> {
            System.out.println(salesPerson + ": " + totalAmount);
        });
    }
}
