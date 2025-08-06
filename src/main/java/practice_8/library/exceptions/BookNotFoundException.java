package practice_8.library.exceptions;

// проверяемое -> Exception (или от его наследников)

public class BookNotFoundException extends Exception{

    public BookNotFoundException(String message){
        super(message);
    }

}
