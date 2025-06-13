package HomeWork_life;

public class Main {

    public static void main(String[] args) {

        // класс Car

        Car bmw = new Car("БМВ", 2024);

        bmw.setYear(2005);

        bmw.print();

        // класс Rectangle

        Rectangle rectangle1 = new Rectangle(10, 12);

        rectangle1.setWidth(12);

        System.out.println("Площадь прямоугольника = " + rectangle1.calculateArea());

        // класс Book

        Book nouseBook = new Book("Нос", "Николай Гоголь");

        nouseBook.setAuthor("Василий");

        nouseBook.printInfo();

        // Класс BankAccount

        BankAccount bankAccountDima = new BankAccount("Дима", 100);

        bankAccountDima.deposit(400);

        bankAccountDima.withdraw(100);

        bankAccountDima.printBalance();

        // Класс Point

        Point point1 = new Point(13, 9);

        point1.setX(10);

        point1.print();

        // Класс StudentGroup

        StudentGroup studentGroup1 = new StudentGroup ("1", 20);

        studentGroup1.setStudentCount(15);

        studentGroup1.printInfo();

        // Класс Circle

        Circle bigCircle = new Circle(58);

        bigCircle.setRadius(77);

        System.out.println("Площадь окружности = " + bigCircle.calculateArea());
        System.out.println("Длина окружности = " + bigCircle.calculateCircumference());

        // Класс Teacher

        Teacher teacherMath = new Teacher("Николай Васильевич" , "математика");

        teacherMath.setSubject("алгебру");

        teacherMath.printInfo();

        // Класс Product

        Product banan = new Product("Банан", 50);

        banan.setPrice(100);

        banan.applyDiscount(30);

        banan.printInfo();

        // Класс Laptop

        Laptop laptopLenovo = new Laptop("Леново", 50000);

        laptopLenovo.setPrice(55000);

        laptopLenovo.printInfo();
    }
}
