package hopur_5.library_system;

import java.time.LocalDate;

public class Returning {
    private User user;
    private Book book;
    private LocalDate dueDate;
    private LocalDate returnedDate;
    private Lending extendedLendings;
    private Returning extendedReturnings;
    private Student extendedStudents;
    private FacultyMember extendedFacultyMembers;
    private User extendedUsers;
    private Author extendedAuthors;

    Returning(User user, Book book, LocalDate dueDate, LocalDate returnedDate) {
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

    }
    private void add(Lending lending) {
        this.extendedLendings.add(lending);
    }
    private void add(Returning returning) {
        this.extendedReturnings.add(returning);
    }
    private void add(Student student) {
        this.extendedStudents.getName();
    }
    private void add(FacultyMember facultyMember) {
        this.extendedFacultyMembers.getName();
    }
    private void add(User user) {
        this.extendedUsers.getClass();
    }
    private void add(Author Firstname,Author Lastname) {
        this.extendedAuthors.getName();
    }
    private void add(Book book) {


}}
