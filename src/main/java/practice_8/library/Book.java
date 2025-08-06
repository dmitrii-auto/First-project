package practice_8.library;

import java.util.Objects;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author){
        this.author = author;
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
