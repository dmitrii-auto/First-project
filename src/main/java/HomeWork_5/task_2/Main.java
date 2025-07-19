package HomeWork_5.task_2;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Cat();
        Pet dog = new Dog();

        PetOwner ivan = new PetOwner();

        ivan.setPet(dog);
        //ivan.setPet(cat);
        ivan.interact();
    }
}
