package practice_7;

public class Main {
    public static void main(String[] args) {
        Person nikita = new Person("Никита", 25);

        System.out.println(nikita.toString());


        Person nikita2 = new Person("Никита", 25);

        System.out.println(nikita.equals(nikita2));

        nikita.hashCode();

        Person newNikita = nikita.clone();

        System.out.println(newNikita);


    }
}
