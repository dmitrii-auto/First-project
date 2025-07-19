package HomeWork_5.task_7;

public class Carousel extends Attraction{

    public Carousel() {
        super("Спокойный аттракцион для детей");
    }

    @Override
    void printIfo() {
        System.out.println(description);
    }

    @Override
    void service() {
        System.out.println("Техническое обслуживание");
    }
}
