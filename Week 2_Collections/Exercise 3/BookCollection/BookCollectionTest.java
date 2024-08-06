public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection myBooks = new BookCollection();
        
        // Adding books
        myBooks.addBook("The Great Gatsby");
        myBooks.addBook("1984");
        myBooks.addBook("To Kill a Mockingbird");
        myBooks.addBook("Pride and Prejudice");

        // Displaying books
        System.out.println("Books in the collection:");
        myBooks.displayBooks();

        // Removing a book
        myBooks.removeBook("1984");

        // Displaying books after removal
        System.out.println("\nBooks in the collection after removing '1984':");
        myBooks.displayBooks();
    }
}
