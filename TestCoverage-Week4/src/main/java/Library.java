import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(String book) {
        books.add(book);
    }
    public void removeBook(String book) {
        books.remove(book);
    }
    public List<String> listBooks() {
        return new ArrayList<>(books);
    }
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("To Kill a Mockingbird");
        library.addBook("1984");
        library.addBook("The Great Gatsby");

        System.out.println("Books in the library: " + library.listBooks());

        library.removeBook("1984");
        System.out.println("Books in the library after removal: " + library.listBooks());
    }
}
