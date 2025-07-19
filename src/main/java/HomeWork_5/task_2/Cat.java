package HomeWork_5.task_2;

public class Cat extends Pet{

    @Override
    public void move() {
        System.out.println("Кошка играет");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест влажный корм");
    }
}
