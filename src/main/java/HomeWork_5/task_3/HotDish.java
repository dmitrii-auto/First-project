package HomeWork_5.task_3;

public class HotDish extends Dish{
    private int temperature;
    private final static int DEFAULT_TEMPERATURE = 45;

    public HotDish(){
        this.temperature = DEFAULT_TEMPERATURE;
    }

    @Override
    public void printInfo() {
        System.out.println("Температура блюда равна " + this.temperature + " градусов Цельсия");
    }
}
