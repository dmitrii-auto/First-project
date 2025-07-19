package HomeWork_5.task_1;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal elephant = new Elephant();

        Zoo zoo = new Zoo();

        //zoo.setAnimal(bird);
        zoo.setAnimal(elephant);
        zoo.demonstrateBehavior();
    }
}
