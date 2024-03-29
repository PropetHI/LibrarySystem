package hopur_5.library_system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class LibrarySystemTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void addBookWithTitleAndAuthorlist() throws Exception {
        LibrarySystem system = new LibrarySystem();
        system.addBookWithTitleAndAuthorlist("Book1", new ArrayList<Author>() {{
            add(new Author("Author1"));
            add(new Author("Author2"));
        }});
        Book book = system.findBookByTitle("Book1");
        assertEquals("Book1", book.getTitle());
        assertEquals(2, book.getAuthors().size());
    }

    @Test
    void addStudentUser() {
        LibrarySystem system = new LibrarySystem();
        system.addStudentUser("John", false);
        assertEquals("John", system.findUserByName("John").getName());

    }

    @Test
    void addFacultyUser() {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addFacultyUser("John", "Computer Science");
        assertEquals("John", librarySystem.findUserByName("John").getName());
    }

    @Test
    void findBookByTitle() throws Exception {
        LibrarySystem librarySystem = new LibrarySystem();
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("J.R.R. Tolkien"));
        librarySystem.addBookWithTitleAndAuthorlist("The Hobbit", authors);
        assertEquals("The Hobbit", librarySystem.findBookByTitle("The Hobbit").getTitle());
    }

    @Test
    void findUserByName() {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addStudentUser("John", false);
        assertEquals("John", librarySystem.findUserByName("John").getName());
    }

    @Test
    void borrowBook() throws Exception {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addStudentUser("Aaron", true);
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("J.R.R. Tolkien"));
        librarySystem.addBookWithTitleAndAuthorlist("The Hobbit", authors);
        librarySystem.borrowBook(librarySystem.findUserByName("Aaron"), librarySystem.findBookByTitle("The Hobbit"));
    }


    @Test
    void returnBook() throws Exception {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addStudentUser("John", true);
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("J.R.R. Tolkien"));
        librarySystem.addBookWithTitleAndAuthorlist("The Hobbit", authors);
        librarySystem.borrowBook(librarySystem.findUserByName("John"), librarySystem.findBookByTitle("The Hobbit"));
        librarySystem.returnBook(librarySystem.findUserByName("John"), librarySystem.findBookByTitle("The Hobbit"));
    }
}