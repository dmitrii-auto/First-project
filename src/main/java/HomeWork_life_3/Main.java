package HomeWork_life_3;

public class Main {

    public static void main(String[] args) {

        // Класс Company

        System.out.println("\nКласс Company");

        Company companyIvan = new Company(1111, "Иван");
        Company companyDima = new Company(1112, "Дима");
        Company companyKolya = new Company(1113, "Николай");

        // имя компании и инфо о сотрудников ДО изменения имени компании
        Company.printCompanyName();

        companyIvan.printInfo();
        companyDima.printInfo();
        companyKolya.printInfo();

        Company.setCompanyName("ООО новое ИП");

        // имя компании и инфо о сотрудников ПОСЛЕ изменения имени компании

        Company.printCompanyName();

        companyIvan.printInfo();
        companyDima.printInfo();
        companyKolya.printInfo();

        // Попробуйте изменить employeeID — должно быть невозможно.
        //companyIvan.EMPLOYEE_ID = 3333; // ошибка из-за модификатора доступа


        // Класс MathConstants

        System.out.println("\nКласс MathConstants");

        MathConstants.printCircleInfo(2.5);
        MathConstants.printCircleInfo(5);

        // Класс Library — модификаторы доступа

        System.out.println("\nКласс Library — модификаторы доступа");

        Library libraryMain = new Library("Три товарища", "Ремарк", 1995, "роман" );

        // проверка доступа при обращении через геттер к полям

        System.out.println(libraryMain.getBookTitle());
        System.out.println(libraryMain.getAuthor());
        System.out.println(libraryMain.getYear());
        System.out.println(libraryMain.getCategory());

        System.out.println("\n");

        // проверка доступа при прямом обращении к полям
        //System.out.println(libraryMain.bookTitle); нет доступа из-за модификатора доступа private
        System.out.println(libraryMain.author);
        System.out.println(libraryMain.year);
        System.out.println(libraryMain.category);

        // Класс University

        System.out.println("\nКласс University");

        University universityIvan = new University(1111, "Иван");
        University universityDima = new University(1112, "Дима");
        University universityKolya = new University(1113, "Николай");

        //University.setUniversityName("МГУ");
        University.changeUniversityName("МГУ");
        universityIvan.printStudentInfo();
        universityDima.printStudentInfo();
        universityKolya.printStudentInfo();

        University.changeUniversityName("ВГУ");

        System.out.println("\nПосле изменения имени университета");
        universityIvan.printStudentInfo();
        universityDima.printStudentInfo();
        universityKolya.printStudentInfo();

        // Класс GameSettings

        System.out.println("\nКласс GameSettings");

        GameSettings gameDocka = new GameSettings("Дока", 9);
        GameSettings gameCS = new GameSettings("КС", 7);

        GameSettings.setMaxPlayers(10);

        gameDocka.addPlayer();
        gameCS.addPlayer();

        gameDocka.printGameStatus();
        gameCS.printGameStatus();

        // Класс Person

        System.out.println("\nКласс Person");

        Person personIvan = new Person("Иван", "Иванов", "123-45-6789");
        Person personDima = new Person("Дима", "Петров", "123-45-6711");
        Person personKolya = new Person("Коля", "Сидоров", "123-99-6789");

        personDima.setFirstName("Петя");

        personIvan.printPersonInfo();
        personDima.printPersonInfo();
        personKolya.printPersonInfo();
    }

}
