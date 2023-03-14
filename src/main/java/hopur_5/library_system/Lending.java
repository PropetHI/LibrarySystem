package hopur_5.library_system;

import java.time.LocalDate;
import java.util.Locale;

public class Lending {
    private User user;

    private Book book;
    private LocalDate dueDate;

    private Lending extendedLendings;
    private Student extendedStudents;


    public Lending(User user, Book book) {
        this.user = user;
        this.book = book;

    }
public LocalDate getDueDate() {
        return this.dueDate;


    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;

    }
    public Book getBook() {
        return this.book;
    }
    public void setBook(Book book) {


    }
    public User getUser() {
        return this.user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}