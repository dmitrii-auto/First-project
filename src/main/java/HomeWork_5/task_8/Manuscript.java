package HomeWork_5.task_8;

public class Manuscript extends Exhibit{

    public Manuscript() {
        super("Манускрипт был найден в 1753 году....");
    }

    @Override
     void printIfo() {
        System.out.println(history);
    }

    @Override
     void manage() {
        System.out.println("Контролировать влажность");
    }
}
