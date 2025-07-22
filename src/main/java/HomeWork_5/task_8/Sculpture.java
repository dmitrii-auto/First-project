package HomeWork_5.task_8;

public class Sculpture extends Exhibit{

    public Sculpture() {
        super("Скульптура была созадана в 1024 году.....");
    }

    @Override
    public void printInfo() {
        System.out.println(history);
    }

    @Override
    public void manage() {
        System.out.println("Провести реставрацию");
    }
}
