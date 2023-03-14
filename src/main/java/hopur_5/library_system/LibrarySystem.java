package hopur_5.library_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<User> users = new ArrayList<>();
    private List<Book> books;

    private List<FacultyMember> facultyMembers;
    private List<Student> students;
    private List<Lending> lendings;
    private List<Returning> returning;
    private List<Book> borrowedBooks;
    private List<Book> returnedBooks;
    private List<Lending> extendedLendings;
    private List<Returning> extendedReturnings;
    private List<Student> extendedStudents;
    private List<FacultyMember> extendedFacultyMembers;
    private List<User> extendedUsers;
    private List<Author> extendedAuthors;
    private List<Book> extendedBooks;
    private Author currentAuthor;
    private Book currentBook;
    private LocalDate dueDate;
    private LocalDate returnedDate;


    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.lendings = new ArrayList<>();
        this.returning = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        this.returnedBooks = new ArrayList<>();
        this.extendedLendings = new ArrayList<>();
        this.extendedReturnings = new ArrayList<>();
        this.extendedStudents = new ArrayList<>();
        this.extendedFacultyMembers = new ArrayList<>();
        this.extendedUsers = new ArrayList<>();
        this.extendedAuthors = new ArrayList<>();
        this.extendedBooks = new ArrayList<>();
    }





    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws Exception {
        Book book = new Book(title, authors);
        books.add(book);
    }

    public void addStudentUser(String name, boolean feePaid) {




    }


    public void addFacultyMemberUser(String name, String department) {
        FacultyMember facultyMember = new FacultyMember(name, department);
        facultyMembers.add(facultyMember);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }


        }
        return null;








    }


    public void borrowBook(User user, Book book) throws NullUserException, NullBookException, UserCannotBorrowSameBookException {
        if (user == null) {
            throw new NullUserException("User cannot be null");
        }
        if (book == null) {
            throw new NullBookException("Book cannot be null");
        }
        if (user.getName().equals(book.getTitle())) {
            throw new UserCannotBorrowSameBookException("User cannot borrow same book");
    }
}

    private class NullUserException extends Throwable {
        public NullUserException(String userCannotBeNull) {
            super(userCannotBeNull);
        }
        }

    private class NullBookException extends Throwable {
        public NullBookException(String bookCannotBeNull) {
        }
    }

    private class UserCannotBorrowSameBookException extends Throwable {

        public UserCannotBorrowSameBookException(String userCannotBorrowSameBook) {
            super(userCannotBorrowSameBook);
        }
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {
        this.dueDate = newDueDate;
        this.returnedDate = LocalDate.now();
        this.extendedLendings.add(new Lending(facultyMember, book, newDueDate, LocalDate.now()));
    }
    public static void main(String[] args) throws Exception, NullUserException, NullBookException, UserCannotBorrowSameBookException {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addBookWithTitleAndAuthorlist("The Hobbit", new ArrayList<>());
        librarySystem.users.add(new Student("John", true));
        librarySystem.dueDate = LocalDate.of(2022, 1, 1);
        librarySystem.returnedDate = LocalDate.of(2022, 5, 1);
        librarySystem.borrowBook(librarySystem.users.get(0), librarySystem.findBookByTitle("The Hobbit"));
        System.out.println(librarySystem.findBookByTitle("The Hobbit"));
        System.out.println(librarySystem.findBookByTitle("The Hobbit")+"\n"+librarySystem.users.get(0)+"\n"+librarySystem.dueDate+"\n"+librarySystem.returnedDate);
    }

}
