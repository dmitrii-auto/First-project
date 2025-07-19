package HomeWork_5.task_2;

public class Dog extends Pet{

    @Override
    public void move() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест сухой корм");
    }
}
