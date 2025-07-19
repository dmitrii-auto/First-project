package HomeWork_5.task_7;

public class RollerСoaster extends Attraction{

    public RollerСoaster(){
        super("Экстремальный аттракцион для взрослых");
    }

    @Override
    void printIfo() {
        System.out.println(description);
    }

    @Override
    void service() {
        System.out.println("Проверка безопасности");
    }
}
