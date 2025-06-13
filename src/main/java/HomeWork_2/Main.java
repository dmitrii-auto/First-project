package HomeWork_2;

public class Main {
    public static void main(String[] args) {

        // Класс Car
        Car bmw = new Car("BMW" , 2024);

        bmw.setYear(2005);

        bmw.print();

        // Класс Rectangle
        Rectangle rectangle1 = new Rectangle (5,5);

        rectangle1.setWidth(10);

        System.out.println("Площадь прямоугольника = " + rectangle1.calculateArea());

        // Класс Book

        Book bookNose = new Book("Нос", "Николай Гоголь");

        bookNose.setAuthor("Василий");

        bookNose.printInfo();

        // Класс BankAccount

        BankAccount bankAccountDima = new BankAccount("Дмитрий", 100);

        bankAccountDima.deposit(400);

        bankAccountDima.withdraw(100);

        bankAccountDima.printBalance();

        // Класс Point

        Point mainPoint = new Point (10, 8);

        mainPoint.setX(17);

        mainPoint.print();

        // Класс StudentGroup

        StudentGroup studentGroupMain = new StudentGroup ("321", 20);

        studentGroupMain.setStudentCount(25);

        studentGroupMain.printInfo();

        // Класс Circle

        Circle circle1 = new Circle(9);

        circle1.setRadius(15);

        System.out.println("Площадь круга = " + circle1.calculateArea());
        System.out.println("Длина окружности круга = " + circle1.calculateCircumference());

        // Класс Teacher

        Teacher teacherMath = new Teacher("Пётр Николаевич", "математика");

        teacherMath.setSubject("алгебра");

        teacherMath.printInfo();

        // Класс Product

        Product banan = new Product("Банан", 500);

        banan.setPrice(100);
        banan.applyDiscount(20);

        banan.printInfo();

        // Класс Laptop

        Laptop laptopLenovo = new Laptop("Lenovo", 50000);

        laptopLenovo.setPrice(45000);

        laptopLenovo.printInfo();
    }
}
