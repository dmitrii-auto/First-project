package HomeWork_5.task_5;

public class Chicken extends Pet{
    @Override
    public void performFunction() {
        System.out.println("Несёт яйца");
    }

    @Override
    public void satisfyNeed() {
        System.out.println("Требует зерно");
    }
}
