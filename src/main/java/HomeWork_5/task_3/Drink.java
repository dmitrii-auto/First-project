package HomeWork_5.task_3;

public class Drink extends Dish{

    private double volume;
    private static final double DEFAULT_VOLUME = 0.5;

    public Drink(){
        this.volume = DEFAULT_VOLUME;
    }

    @Override
    public void printInfo() {
        System.out.println("Обьём напитка составлеяет " + this.volume + " литра");
    }
}
