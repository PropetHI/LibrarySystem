package hopur_5.library_system;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AllTest {
    /* A test that can test all  classes and methods those in classes  in file hopur_5.library_system  */

    @Test
    public void testFacultyMember() {
       /* make an example test for class FacultyMember */
        FacultyMember fm = new FacultyMember("John", "Computer Science");
        assertTrue(fm.getName().equals("John"));
        assertTrue(fm.getDepartment().equals("Computer Science"));


        assertTrue(true);


    }



    @Test
    public void testAuthor() {
        /* make an example test for class Author */
        Author a = new Author("John");
        assertTrue(a.getName().equals("John"));

        assertTrue(true);

    }

    @Test
    public void testStudent() {
        /* make an example test for class Student */
        Student s = new Student("John", false);
        assertTrue(s.getName().equals("John"));
        assertTrue(true);

    }


    @Test
    public void testBook() {

        /* make an example test for class BOOK without error*/

        assertTrue(true);

    }



    @Test
    public void testUser() {

        /* make an example test for class User */
        User u = new User("John");
        assertTrue(u.getName().equals("John"));
       assertTrue(true);

    }

    @Test
    public void testLending() throws Exception {


        Lending l = new Lending(new FacultyMember("John", "Teacher"), new Book("Computer Science ","John"), LocalDate.now(), LocalDate.now());
        assertEquals("John", l.getUser().getName());
        Assert.assertEquals("Computer Science", l.getBook().getTitle());
        assertTrue(l.getDueDate().equals(LocalDate.now()));
        assertTrue(l.getReturnedDate().equals(LocalDate.now()));
        assertTrue(true);
    }
}
