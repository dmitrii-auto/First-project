package HomeWork_5.task_5;

public class Cow extends Pet{

    @Override
    public void performFunction() {
        System.out.println("Даёт молоко");
    }

    @Override
    public void satisfyNeed() {
        System.out.println("Выпас коровы");
    }
}
