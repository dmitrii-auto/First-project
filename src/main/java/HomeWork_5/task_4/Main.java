package HomeWork_5.task_4;

public class Main {
    public static void main(String[] args) {
        SeaСreature shark = new Shark();
        SeaСreature starfish = new Starfish();

        Aquarium aquarium = new Aquarium();

        //aquarium.setSeaСreature(shark);
        aquarium.setSeaСreature(starfish);
        aquarium.demonstrateBehavior();
    }
}
