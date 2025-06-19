package HomeWork_3;

public class Main {

    public static void main(String[] args) {

        // Класс Company

        System.out.println("Задание 1. Класс Company");

        Company employeeIvan = new Company(1111, "Иванов Иван");
        Company employeePavel = new Company(1112, "Петров Павел");
        Company employeePetr = new Company(1113, "Сидоров Пётр");

        Company.printCompanyName();
        employeeIvan.printEmployeeInfo();
        employeePavel.printEmployeeInfo();
        employeePetr.printEmployeeInfo();

        Company.companyName = "ООО поменяли название компании";

        Company.printCompanyName();

        employeeIvan.printEmployeeInfo();
        employeePavel.printEmployeeInfo();
        employeePetr.printEmployeeInfo();

        // Класс MathConstants

        System.out.println("\nЗадание 2. Класс MathConstants");

        System.out.println("Площадь круга когда r=5 равна " + MathConstants.calculateCircleArea(5));
        System.out.println("Длина окружности когда r=5 равна " + MathConstants.calculateCircumference(5));

        System.out.println("Площадь круга когда r=7 равна " + MathConstants.calculateCircleArea(7));
        System.out.println("Длина окружности когда r=7 равна " + MathConstants.calculateCircumference(7));

        // Класс Library — модификаторы доступа

        System.out.println("\nЗадание 3. Класс Library — модификаторы доступа");

        Library libraryCity = new Library("Три товарища", "Ремарк", 1936, "Роман");

        System.out.println(libraryCity.getBookTitle());
        System.out.println(libraryCity.getAuthor());
        System.out.println(libraryCity.getYear());
        System.out.println(libraryCity.getCategory());

        System.out.println("Проверка прямого обращения к полям");
        //System.out.println(libraryCity.bookTitle); закоментил так как получаю ошибку компиляции (ожидаемое поведение)
        System.out.println(libraryCity.author);
        System.out.println(libraryCity.year);
        System.out.println(libraryCity.category);

        // Класс University

        System.out.println("\nЗадание 4. Класс University");

        University universityIvan = new University(2221, "Иван");
        University universityDima = new University(2222, "Дмитрий");
        University universityKolya = new University(2223, "Николай");

        University.changeUniversityName("ВГУ");


        universityIvan.printStudentInfo();
        universityDima.printStudentInfo();
        universityKolya.printStudentInfo();

        // Класс GameSettings

        System.out.println("\nЗадание 5. Класс GameSettings");

        GameSettings gameSettingsCS = new GameSettings("КС", 6);
        GameSettings gameSettingsDoka = new GameSettings("Дока", 10);

        GameSettings.setMaxPlayers(11);

        gameSettingsCS.addPlayer();
        gameSettingsDoka.addPlayer();

        gameSettingsCS.printGameStatus();
        gameSettingsDoka.printGameStatus();



        // Класс Person

        System.out.println("\nЗадание 6. Класс Person");

        Person personIvan = new Person("Иван", "Иванов", "123-45-6789");
        Person personDima = new Person("Дима", "Петров", "123-45-6000");
        Person personKolya = new Person("Коля", "Громов", "123-99-6789");

        personKolya.setFirstName("Николай");

        personIvan.printPersonInfo();
        personDima.printPersonInfo();
        personKolya.printPersonInfo();




    }

}
