public class MathOperations {

    public static void main (String [] arr) {

        // задание 1
        System.out.println("Результат сложения: " + add(5,5));
        System.out.println("Результат вычитания: " + subtract(55,5));
        System.out.println("Результат умножения: " + multiply(2,3));
        System.out.println("Результат деления: " + divide(3,2));

        // 2. Реализуйте метод для нахождения максимума двух чисел
        System.out.println("Большее из двух чисел это: " + findMax(100,101));

        //3. Метод для нахождения разницы между двумя числами
        int number1 = 10;
        int number2 = 20;
        System.out.println("Модуль разности двух чисел " + number1 + " и " + number2 +" равен "+ difference(number1,number2));

        // 4. Методы для площади и периметра квадрата
        int side = 7;
        System.out.println("Площадь квадрата: " + squareArea(side));
        System.out.println("Периметр квадрата: " + squarePerimeter(side));

        // 5. Метод для перевода секунд в минуты

        int seconds = 120;
        System.out.println( seconds + " секунд равно " + convertSecondsToMinutes(seconds) + " минут");

        // 6. Метод для вычисления средней скорости

        System.out.println("Средняя скорость 1 : " + averageSpeed(100,2));
        System.out.println("Средняя скорость 2 : " + averageSpeed(500,0.5));


        // 7. Метод для нахождения гипотенузы

        int catheter1 = 5;
        int catheter2 = 3;
        System.out.println("Гипотенуза треугольника со сторонами " + catheter1 + " и " + catheter2 + " равна "+ findHypotenuse(catheter1,catheter2));

        int catheter3 = 10;
        int catheter4 = 8;
        System.out.println("Гипотенуза треугольника со сторонами " + catheter3 + " и " + catheter4 + " равна "+ findHypotenuse(catheter1,catheter2));

        // 8. Метод для длины окружности

        System.out.println("Длина окружности 1 : " + circleCircumference(5));
        System.out.println("Длина окружности 2 : " + circleCircumference(5.7));

        // 9. Метод для вычисления процентов

        int total = 200;
        int part = 25;
        System.out.println(part + " из " + total + " это " + calculatePercentage(total, part)+"%");

        // 10. Методы перевода температуры

        int celsius = 200;
        System.out.println( celsius + " градусов Цельсия" + " = " +  celsiusToFahrenheit(200) + " градусов Фарингейта");

        int fahrenheit = 200;
        System.out.println(fahrenheit + " градусов Фарингейта " +" = " +  fahrenheitToCelsius(200) + " градусов Цельсия");

    }

    // задание 1
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {

        if (y == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }

        return (double) x /  y;
    }

    // 2. Реализуйте метод для нахождения максимума двух чисел

    public static int findMax(int a, int b) {
        return Math.max(a,b);
    }

    // 3. Метод для нахождения разницы между двумя числами

    public static int difference(int x, int y) {
        int diff = x - y;
        return Math.abs(diff);
    }

    // 4. Методы для площади и периметра квадрата

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side){
        return side * 4;
    }

    // 5. Метод для перевода секунд в минуты

    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60;
    }

    // 6. Метод для вычисления средней скорости

    public static double averageSpeed(double distance, double time){

        if (time <= 0) {
            throw new IllegalArgumentException("Время должно быть больше нуля");
        }

        return  distance / time;
    }

    // 7. Метод для нахождения гипотенузы

    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a * a + b * b);
    }

    // 8. Метод для длины окружности

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    // 9. Метод для вычисления процентов

    public static double calculatePercentage(double total, double part){

        if (total <= 0) {
            throw new IllegalArgumentException("Число total должно быть больше нуля");
        }

        if (part < 0) {
            throw new IllegalArgumentException("Число part должно быть больше или равно нулю");
        }

        return part / total * 100;
    }

    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }

    // 10. Методы перевода температуры

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }


}
