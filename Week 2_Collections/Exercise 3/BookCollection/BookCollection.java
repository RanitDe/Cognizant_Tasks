import java.util.LinkedHashSet;

public class BookCollection {
    private LinkedHashSet<String> books;

    public BookCollection() {
        books = new LinkedHashSet<>();
    }

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }

    public void displayBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }
}
