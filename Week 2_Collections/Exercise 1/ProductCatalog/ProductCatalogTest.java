public class ProductCatalogTest {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Adding products
        System.out.println("Adding products:");
        catalog.addProduct("Laptop");
        catalog.addProduct("Smartphone");
        catalog.addProduct("Tablet");
        catalog.displayProducts();

        // Trying to add a duplicate product
        System.out.println("\nTrying to add a duplicate product:");
        boolean added = catalog.addProduct("Laptop");
        System.out.println("Added Laptop again: " + added);
        catalog.displayProducts();

        // Removing a product
        System.out.println("\nRemoving a product:");
        catalog.removeProduct("Smartphone");
        catalog.displayProducts();

        // Searching for a product
        System.out.println("\nSearching for a product:");
        boolean found = catalog.searchProduct("Tablet");
        System.out.println("Tablet found: " + found);
        found = catalog.searchProduct("Smartphone");
        System.out.println("Smartphone found: " + found);
    }
}
