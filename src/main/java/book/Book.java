package book;

import java.util.Date;

public class Book {
    String title;
    String author;
    Date published;

    public Book(String title, String author, Date published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public Date getPublished() {
        return published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
