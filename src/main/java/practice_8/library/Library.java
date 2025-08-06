package practice_8.library;

import practice_8.library.exceptions.BookNotFoundException;
import practice_8.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    // добавлять книгу
    // Обработка исключения: если есть существующая книга,
    // то получаем непроверяемое исключение InvalidBookException

    public void addBook(Book book) throws InvalidBookException{
        if (books.contains(book)){
            throw new InvalidBookException("Такая книга уже сущесвует в библиотеке");
        } else {
            books.add(book);
        }
    }

    // искать книгу
    // Обработка исключения: если мы не можем найти книгу,
    // то случится проверяемое исключение BookNotFoundException

    public String findBook(String name) throws BookNotFoundException{
        AtomicReference<String> foundBook = new AtomicReference<>();
        books.forEach(
                book -> {
                    if (book.getName() == name){
                        foundBook.set(name);
                    }
                }
        );

        if (foundBook.get() == null){
            throw new BookNotFoundException("Книга не найдена по имени " + name);
        };

        return foundBook.get();
    }



}
