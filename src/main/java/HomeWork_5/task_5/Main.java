package HomeWork_5.task_5;

public class Main {
    public static void main(String[] args) {

        Pet cow = new Cow();
        Pet chicken = new Chicken();

        Farm farm = new Farm();

        farm.setPet(cow);
        farm.manage();

    }
}
