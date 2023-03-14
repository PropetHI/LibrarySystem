package hopur_5.library_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<User> users = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Lending> lendings = new ArrayList<>();

    public LibrarySystem() {
        this.users.add(new FacultyMember("John", "Computer Science"));
    }
    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws Exception {
        Book book = new Book(title, authors);
        this.books.add(book);

    }
    public void addStudentUser(String name, boolean feePaid){
        User user = new Student(name, feePaid);
        this.users.add(user);
    }
    public void addFacultyUser(String name,String department ){
        User user = new FacultyMember(name, department);
        this.users.add(user);

    }
    public Book findBookByTitle(String title){
        for (Book book : books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
    public User findUserByName(String name){

        for (User user : users){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;

    }
    public void borrowBook(User user, Book book) throws UserOrBookDoesNotExistException{
        if (user == null){
            throw new UserOrBookDoesNotExistException("User cannot be null");
        }
        if (book == null){
            throw new UserOrBookDoesNotExistException("Book cannot be null");
        }
        if (findUserByName(user.getName()) == null){
            throw new UserOrBookDoesNotExistException("User does not exist");
        }
        Lending lending = new Lending(user, book);
        lendings.add(lending);
    }
    public Lending extendLending(User user, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException{
        if (user == null){
            throw new UserOrBookDoesNotExistException("User cannot be null");
        }
        if (book == null){
            throw new UserOrBookDoesNotExistException("Book cannot be null");
        }
        if (findUserByName(user.getName()) == null){
            throw new UserOrBookDoesNotExistException("User does not exist");
        }
        if (findBookByTitle(book.getTitle()) == null){
            throw new UserOrBookDoesNotExistException("Book does not exist");
        }
        if (newDueDate == null){
            throw new UserOrBookDoesNotExistException("New due date cannot be null");
        }
        Lending extendedLending = new Lending(user, book);
        lendings.add(extendedLending);
        return extendedLending;
    }
    public void returnBook(User user, Book book)throws UserOrBookDoesNotExistException{
        if (user == null){
            throw new UserOrBookDoesNotExistException("User cannot be null");
        }
        if (book == null){
            throw new UserOrBookDoesNotExistException("Book cannot be null");
        }
        if (findUserByName(user.getName()) == null){
            throw new UserOrBookDoesNotExistException("User does not exist");
        }
        for (Lending lending : lendings){
            if (lending.getBook().equals(book) && lending.getUser().equals(user)){
                lendings.remove(lending);
                return;
            }
        }
        throw new UserOrBookDoesNotExistException("Lending does not exist");
    }

    }


