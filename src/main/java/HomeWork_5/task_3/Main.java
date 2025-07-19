package HomeWork_5.task_3;

public class Main {
    public static void main(String[] args) {

        Dish pizza = new HotDish();
        Dish cola = new Drink();

        Menu menu = new Menu();

        //menu.setDish(pizza);
        menu.setDish(cola);
        menu.printInfo();
    }
}
