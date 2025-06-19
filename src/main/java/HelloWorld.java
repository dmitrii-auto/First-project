public class HelloWorld {

    public static void main(String[] arr) {
        int sum1 = sum(12, 8);
        System.out.println("Результат сложения " + sum1);

        int mult1 = multiply(3, 9);
        System.out.println("Результат умножения " + mult1);

        int subst1 = substract(100, 50);
        System.out.println("Результат вычитания " + subst1);

        double divide1 = divide(3, 2);
        System.out.println("Результат деления " + divide1);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiply(int q, int w) {
        int mult = q * w;
        return mult;
    }

    public static int substract(int x, int y) {
        return x - y;
    }


    public static double divide(int x, int y) {
        return (double) x / y;
    }


}

// comand + n - генератор кода
//comand + option + L - код бьютифай
//comand +option + / - многострочный коммент
//


