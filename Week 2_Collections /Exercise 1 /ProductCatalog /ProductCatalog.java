import java.util.HashSet;

public class ProductCatalog {
    private HashSet<String> products;

    public ProductCatalog() {
        products = new HashSet<>();
    }

    // Method to add a product
    public boolean addProduct(String productName) {
        return products.add(productName);
    }

    // Method to remove a product
    public boolean removeProduct(String productName) {
        return products.remove(productName);
    }

    // Method to search for a product
    public boolean searchProduct(String productName) {
        return products.contains(productName);
    }

    // Method to display all products
    public void displayProducts() {
        System.out.println("Product Catalog:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
