package book;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Date;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class TestBook {

    public static Stream<Arguments> getTitles() {
        return Stream.of(
                Arguments.of("title1"),
                Arguments.of("title2"),
                Arguments.of("title3")
        );
    }

    public static Stream<Arguments> getAuthors() {
        return Stream.of(
                Arguments.of("author1"),
                Arguments.of("author2"),
                Arguments.of("author3")
        );
    }

    public static Stream<Arguments> getPublished() {
        return Stream.of(
                Arguments.of(new Date()),
                Arguments.of(new Date()),
                Arguments.of(new Date())
        );
    }
    @MethodSource("getTitles")
    @org.junit.jupiter.params.ParameterizedTest
    public void testGetTitle(String title) {
        Book b = new Book(title, "author", new Date());
        assertEquals(title, b.getTitle());
    }

    @MethodSource("getAuthors")
    @org.junit.jupiter.params.ParameterizedTest
    public void testGetAuthor(String author) {
        Book b = new Book("title", author, new Date());
        assertEquals(author, b.getAuthor());
    }

    @MethodSource("getPublished")
    @org.junit.jupiter.params.ParameterizedTest
    public void testGetPublished(Date published) {
        Book b = new Book("title", "author", published);
        assertEquals(published, b.getPublished());
    }
}
