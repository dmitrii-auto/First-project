package HomeWork_5.task_7;

import HomeWork_5.task_3.Menu;

public class Main {
    public static void main(String[] args) {

        Attraction rollerCoaster = new RollerСoaster();
        Attraction carousel = new Carousel();

        Manager ivan = new Manager();

        ivan.printIfo(rollerCoaster);
        ivan.service(rollerCoaster);

        ivan.printIfo(carousel);
        ivan.service(carousel);
    }
}
