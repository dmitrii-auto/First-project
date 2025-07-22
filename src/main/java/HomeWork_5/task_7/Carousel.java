package HomeWork_5.task_7;

public class Carousel extends Attraction{

    public Carousel() {
        super("Спокойный аттракцион для детей");
    }

    @Override
    void printInfo() {
        System.out.println(description);
    }

    @Override
    void service() {
        System.out.println("Техническое обслуживание");
    }
}
