package book;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.AssertJUnit.assertEquals;

public class TestBook {

    @Test
    public void testBook() {
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", new Date());
        assertEquals("The Hobbit", book.getTitle());
        assertEquals("J.R.R. Tolkien", book.getAuthor());
        assertEquals(new Date(), book.getPublished());
    }
}
