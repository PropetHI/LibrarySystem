package hopur_5.library_system;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) throws Exception{
        if (title == null || title.isEmpty()){
            throw new Exception("Title cannot be null or empty");
        }
        if (authors == null) {
            throw new EmptyAuthorListException("No authors in the list");
        }
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() throws EmptyAuthorListException{
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }
}
