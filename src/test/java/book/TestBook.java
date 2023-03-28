package book;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Date;

import static org.testng.Assert.assertEquals;

public class TestBook {

    @MethodSource("book.Book")
    @Test
    public void testBook() {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", new Date(1954, 1, 1));
        assertEquals("The Lord of the Rings", book.getTitle());
        assertEquals("J.R.R. Tolkien", book.getAuthor());
        assertEquals(new Date(1954, 1, 1), book.getPublished());
    }
}
