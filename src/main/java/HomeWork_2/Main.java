package HomeWork_2;

public class Main {
    public static void main(String[] args) {

        // Класс Car

        System.out.println("\n");

        Car bmw = new Car("BMW" , 2024);

        bmw.setYear(2005);

        bmw.print();

        // Класс Rectangle

        System.out.println("\n");

        Rectangle rectangle1 = new Rectangle (5,5);

        rectangle1.setWidth(10);

        System.out.println("Площадь прямоугольника = " + rectangle1.calculateArea());

        // Класс Book

        System.out.println("\n");

        Book bookNose = new Book("Нос", "Николай Гоголь");

        bookNose.setAuthor("Василий");

        bookNose.printInfo();

        // Класс BankAccount

        System.out.println("\n");

        BankAccount bankAccountDima = new BankAccount("Дмитрий", 100);

        bankAccountDima.deposit(400);

        bankAccountDima.withdraw(100);

        bankAccountDima.printBalance();

        // Класс Point

        System.out.println("\n");

        Point mainPoint = new Point (10, 8);

        mainPoint.setX(17);

        mainPoint.print();

        // Класс StudentGroup

        System.out.println("\n");

        StudentGroup studentGroupMain = new StudentGroup ("321", 20);

        studentGroupMain.setStudentCount(25);

        studentGroupMain.printInfo();

        // Класс Circle

        System.out.println("\n");

        Circle circle1 = new Circle(9);

        circle1.setRadius(15);

        circle1.printInfo();

        // Класс Teacher

        System.out.println("\n");

        Teacher teacherMath = new Teacher("Пётр Николаевич", "математика");

        teacherMath.setSubject("алгебра");

        teacherMath.printInfo();

        // Класс Product

        System.out.println("\n");

        Product banan = new Product("Банан", 500);

        banan.setPrice(100);
        banan.applyDiscount(20);

        banan.printInfo();

        // Класс Laptop

        System.out.println("\n");

        Laptop laptopLenovo = new Laptop("Lenovo", 50000);

        laptopLenovo.setPrice(45000);

        laptopLenovo.printInfo();
    }
}
