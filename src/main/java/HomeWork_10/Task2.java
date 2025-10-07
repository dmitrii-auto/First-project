package HomeWork_10;

public class Task2 {
    // Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по
    //5 раз с небольшой задержкой между выводами.

    public static void main(String[] args) throws InterruptedException {
        Runnable printA = () -> {
            for (int i=0; i < 5; i++){
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable printB = () -> {
            for (int i=0; i < 5; i++){
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }


}
