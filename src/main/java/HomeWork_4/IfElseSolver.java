package HomeWork_4;

import java.util.Scanner;

public class IfElseSolver {
    public static void main(String[] args) {
        // 1. Определение знака числа
       // determineSignOfNumber();

        // 2. Поиск наибольшего из двух чисел
        //findMax();

        // 3. Вывод оценки по шкале 1–5
        // markInfo();

        // 4. Проверка на чётность
       // checkParity();

        // 5. Определение размера скидки по возрасту
        // calculateDiscount();

        // 6. Оценка результата теста по баллам
        //testResult();
    }

    public static void determineSignOfNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void findMax(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("Среди чисел большим является: " + number1);
        } else if (number1 < number2) {
            System.out.println("Среди чисел большим является: " + number2);
        } else {
            System.out.println("Числа равны");
        }
    }

    public static void markInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 5: ");
        int mark = scanner.nextInt();

        if (mark > 0 && mark <=5){
            if (mark == 5){
                System.out.println(mark + " — \"Отлично\"");
            } else if (mark == 4){
                System.out.println(mark + " — \"Хорошо\"");
            } else if (mark == 3){
                System.out.println(mark + " — \"Удовлетворительно\"");
            }else {
                System.out.println(mark + " — \"Неудовлетворительно\"");
            }
        } else {
            System.out.println("Введите число от 1 до 5");
        }
    }

    public static void checkParity(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Число чётное");
        } else {
            System.out.println("Число НЕ чётное");
        }
    }

    public static void calculateDiscount() {
        // по условию непонятно для 18 лет должна быть скидка или нет? Я понимаю что нет

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age > 0 && age <= 110){
            if (age < 18){
                System.out.println("Вам доступна скидка 25%");
            } else if (age >= 65) {
                System.out.println("Вам доступна скидка 30%");
            } else {
                System.out.println("Для вас нет доступных скидок");
            }
        } else {
            System.out.println("Введён некорректный возраст");
        }
    }

    public static void testResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш балл за тест: ");
        int scores = scanner.nextInt();

        if (scores >= 0 && scores <= 100){

            if (scores >= 90){
                System.out.println("Отлично");
            } else if (scores >= 75 && scores <= 89){
                System.out.println("Хорошо");
            } else if (scores >= 60 && scores <= 74) {
                System.out.println("Удовлетворительно");
            } else {
                System.out.println("Неудовлетворительно");
            }
        } else {
            System.out.println("Введён некорректный балл");
        }

    }


}
