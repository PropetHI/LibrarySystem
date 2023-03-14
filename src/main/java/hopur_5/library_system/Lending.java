package hopur_5.library_system;

import java.time.LocalDate;

public class Lending {
    private  User user;
    private Author author;
    private Book book;
    private LocalDate dueDate;
    private LocalDate returnedDate;
    private Lending extendedLendings;
    private Student extendedStudents;


    Lending(User user, Book book, LocalDate dueDate, LocalDate returnedDate) {
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
        this.returnedDate = returnedDate;


    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;

    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;

    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public LocalDate getReturnedDate() {
        return returnedDate;
    }
    public void setReturnedDate(LocalDate returnedDate) {
        this.returnedDate = returnedDate;
    }
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {
        this.dueDate = newDueDate;
        this.returnedDate = LocalDate.now();
        this.extendedLendings.add(new Lending(facultyMember, book, newDueDate, LocalDate.now()));



    }

    void add(Lending lending) {
        this.extendedLendings.add(lending);
    }

    public void extendReturning(FacultyMember facultyMember, Book book, LocalDate newReturnedDate) {
        this.returnedDate = newReturnedDate;
        this.extendedLendings.add(new Lending(facultyMember, book, LocalDate.now(), newReturnedDate));

    }

    void add(Returning returning) {
        this.extendedLendings.add(returning);

    }
        public void extendFacultyMember(FacultyMember facultyMember, Book book, LocalDate newDueDate) {
            this.dueDate = newDueDate;
            this.extendedLendings.add(new Lending(facultyMember, book, LocalDate.now(), LocalDate.now()));
        }
    public void extendUser(User user, Book book, LocalDate newDueDate) {
        this.dueDate = newDueDate;
        this.extendedLendings.add(new Lending(user, book, LocalDate.now(), LocalDate.now()));

    }
    public <Lastname> void extendAuthor(Author Name  ,Book book, LocalDate newDueDate) {
        this.dueDate = newDueDate;
        this.extendedLendings.add(new Lending(user, book, LocalDate.now(), LocalDate.now()));
    }
    public void extendStudent(Student student, Book book, LocalDate newDueDate) {
        this.dueDate = newDueDate;
        this.extendedLendings.add(new Lending(student, book, LocalDate.now(), LocalDate.now()));
    }

    public void extendBook(Author author,Book book, LocalDate newDueDate) {
        this.dueDate = newDueDate;

        this.extendedLendings.add(new Lending(user ,book, LocalDate.now(), LocalDate.now()));

    }
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate, LocalDate newReturnedDate) {

    }
    public void extendReturning(FacultyMember facultyMember, Book book, LocalDate newDueDate, LocalDate newReturnedDate) {
        this.dueDate = newDueDate;
        this.returnedDate = newReturnedDate;
        this.extendedLendings.add(new Lending(facultyMember, book, newDueDate, newReturnedDate));
    }
    public void extendUser(User user, Book book, LocalDate newDueDate, LocalDate newReturnedDate) {
        this.dueDate = newDueDate;
        this.returnedDate = newReturnedDate;
        this.extendedLendings.add(new Lending(user, book, newDueDate, newReturnedDate));
    }
    public void extendAuthor(Author author, Book book, LocalDate newDueDate, LocalDate newReturnedDate) {
        this.dueDate = newDueDate;
        this.returnedDate = newReturnedDate;
        this.author=author;
        this.extendedLendings.add(new Lending(user,book, newDueDate, newReturnedDate));

    }


    public void extendBook(Book book, LocalDate newDueDate, LocalDate newReturnedDate) {
        this.dueDate = newDueDate;
        this.returnedDate = newReturnedDate;
        this.extendedLendings.add(new Lending(user, book, newDueDate, newReturnedDate));
    }
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate, LocalDate newReturnedDate, LocalDate newDueDate1, LocalDate newReturnedDate1) {
        this.dueDate = newDueDate;
        this.returnedDate = newReturnedDate;
        this.extendedLendings.add(new Lending(facultyMember, book, newDueDate, newReturnedDate));
    }
    public void extendReturning(FacultyMember facultyMember, Book book, LocalDate newDueDate, LocalDate newReturnedDate, LocalDate newDueDate1, LocalDate newReturnedDate1) {
        this.dueDate = newDueDate;
        this.returnedDate = newReturnedDate;
    }
    public void extendFacultyMember(FacultyMember facultyMember, Book book, LocalDate newDueDate, LocalDate newReturnedDate) {
        this.dueDate = newDueDate;
        this.returnedDate = newReturnedDate;
        this.extendedLendings.add(new Lending(facultyMember, book, newDueDate, newReturnedDate));
    }

    public Object getName() {
    return this.user.getName();
    }
}
