import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class LibraryTest {

    @Test
    public void testAddAndListBooks() {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        List<String> books = library.listBooks();
        assertEquals(1, books.size(), "There should be 1 book in the library");
        assertEquals("The Great Gatsby", books.get(0), "The first book should be The Great Gatsby");
    }
    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.listBooks();
        assertEquals(0, books.size(), "There should be no books in the library");
    }
}
