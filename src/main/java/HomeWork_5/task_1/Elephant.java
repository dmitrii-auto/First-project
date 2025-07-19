package HomeWork_5.task_1;

public class Elephant extends Animal {

    private String name = "Слон";

    @Override
    public void makeSound() {
        System.out.println("Cлон трубит");
    }

    @Override
    public void move() {
        System.out.println("Слон ходит");
    }
}
