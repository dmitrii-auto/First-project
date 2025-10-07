package HomeWork_10;

public class Task3 {
// Создайте поток, который бесконечно увеличивает счётчик. В основном потоке через
//2 секунды установите флаг stop = true, чтобы остановить поток.
private static volatile boolean stop = false;
private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            while (!stop){
                count++;
            }
            System.out.println("Счётчик остановился на значении: " + count);
        };

        Thread t1 = new Thread(task);
        t1.start();

        Thread.sleep(2000);

        stop = true;
        t1.join();
        System.out.println("Конец программы");
    }




}
