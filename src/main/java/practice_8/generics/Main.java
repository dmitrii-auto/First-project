package practice_8.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Элемент");
        System.out.println(boxString.getElement());

        Box<Integer> boxInt = new Box<>();
        boxInt.setElement(1);
        System.out.println(boxInt.getElement());

        Box<Book> books = new Box<>();
        books.setElement(new Book("Книга"));
        System.out.println(books.getElement());
    }

}
