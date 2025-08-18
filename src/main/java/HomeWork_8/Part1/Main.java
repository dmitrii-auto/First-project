package HomeWork_8.Part1;

public class Main {
    public static void main(String[] args) {
        // Task1
        System.out.println("Task1");

        MathOperation add = (x,y) -> x + y;
        MathOperation subtract = (x,y) -> x - y;
        MathOperation multiplication = (x,y) -> x * y;
        MathOperation division = (x,y) -> {
            if (y == 0.0){
                throw new ArithmeticException("На ноль делить нельзя");
            }
            return x / y;
        };

        System.out.println(add.operation(2,2));
        System.out.println(subtract.operation(10,2));
        System.out.println(multiplication.operation(20,2));
        System.out.println(division.operation(20,0));

    }
}
