package HomeWork_5.task_1;

public class Bird extends Animal {

    private String name = "Птица";

    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    public void move() {
        System.out.println("Птица летает");
    }
}
