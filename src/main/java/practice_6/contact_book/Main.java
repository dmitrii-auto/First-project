package practice_6.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Вася", 8855);
        contactBook.addContact("Петя", 3534);

        contactBook.printContacts();

        contactBook.updatePhone("Вася", 7777);
        contactBook.printContacts();
    }
}
