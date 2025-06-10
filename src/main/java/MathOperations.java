public class MathOperations {

    public static void main (String [] arr){

        // задание 1
        System.out.println("Результат сложения " + add(5, 4));
        System.out.println("Результат вычитания " + subtract(5, 4));
        System.out.println("Результат умножения " + multiply(5, 4));
        System.out.println("Результат деления " + divide(5, 4));

        // 2. Реализуйте метод для нахождения максимума двух чисел

        int a = 10;
        int b = 11;
        System.out.println("Среди чисел " + a + " и " + b + " большим является " + findMax(a,b));

        // 3. Метод для нахождения разницы между двумя числами

        System.out.println("Модуль разницы чисел равен " + difference(7, 17));

        // 4. Методы для площади и периметра квадрата

        int side = 7;
        System.out.println("Площадь квадрата со стороной " + side + " равна " + squareArea(side));
        System.out.println("Периметр квадрата со стороной " + side + " равен " + squarePerimeter(side));

        // 5. Метод для перевода секунд в минуты
        int seconds = 150;
        System.out.println( seconds + " секунд это " + convertSecondsToMinutes(seconds) + " минут/ы");

        // 6. Метод для вычисления средней скорости

        System.out.println("Средняя скорость Пети : " + averageSpeed(500, 60));
        System.out.println("Средняя скорость Васи : " + averageSpeed(500, 50));

        // 7. Метод для нахождения гипотенузы

        System.out.println("Гипотенуза треугольника 1 = " + findHypotenuse(3, 4));
        System.out.println("Гипотенуза треугольника 2 = " + findHypotenuse(13, 4));
        System.out.println("Гипотенуза треугольника 3 = " + findHypotenuse(5, 12));

        // 8. Метод для длины окружности

        System.out.println("Длина окружности А = " + circleCircumference(8));
        System.out.println("Длина окружности Б = " + circleCircumference(8.753));

        // 9. Метод для вычисления процентов
        double total = 200;
        double part = 25;

        System.out.println(part + " из " + total + " ---> " + calculatePercentage(total, part) + "%");

        // 10. Методы перевода температуры
        int celsius = 200;
        int fahrenheit = 250;

        System.out.println(celsius + " градусов Цельсия = " + celsiusToFahrenheit(celsius) + " градусов Фаренгейта");
        System.out.println(celsius + " градусов Фаренгейта = " + fahrenheitToCelsius(fahrenheit) + " градусов Цельсия");
    }

    // задание 1

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    // 2. Реализуйте метод для нахождения максимума двух чисел

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // 3. Метод для нахождения разницы между двумя числами

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    // 4. Методы для площади и периметра квадрата

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side){
        return side * 4;
    }

    // 5. Метод для перевода секунд в минуты

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    // 6. Метод для вычисления средней скорости

    public static double averageSpeed(double distance, double time) {

        if (time == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }

        return distance / time;
    }

    // 7. Метод для нахождения гипотенузы

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b +b);
    }

    // 8. Метод для длины окружности

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    // 9. Метод для вычисления процентов

    public static double calculatePercentage(double total, double part){

        if (total <= 0){
            throw new IllegalArgumentException("total должно быть больше нуля");
        }

        if (part < 0){
            throw new IllegalArgumentException("part должно быть больше или равно нулю");
        }

        return part / total * 100;
    }

    // 10. Методы перевода температуры

    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }

}
