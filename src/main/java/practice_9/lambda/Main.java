package practice_9.lambda;

public class Main {
    public static void main(String[] args) {
        Runnable r2 = () -> System.out.println("Привет мир!");
        r2.run();
    }
}
