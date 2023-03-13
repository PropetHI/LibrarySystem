package hopur_5.library_system;

import java.util.List;

public class Book {
    private String title;
    private String authors;

    public Book(String title, String authors) throws Exception{
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

    public String getAuthors() throws EmptyAuthorListException{
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors.toString();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}
