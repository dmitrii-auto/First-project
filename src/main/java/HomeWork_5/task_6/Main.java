package HomeWork_5.task_6;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid();
        Plant kaktus = new Cactus();

        Garden garden = new Garden();

        garden.setPlant(kaktus);
        garden.care();
    }
}
