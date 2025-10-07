package HomeWork_10;

public class Task1 {
    //Напишите программу, в которой создается отдельный поток, выводящий сообщение
    //"Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

    public static void main(String[] args) {

        Runnable task = () ->{
            for (int i = 0; i < 5; i++){
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(task);
        t1.start();

    }


}
