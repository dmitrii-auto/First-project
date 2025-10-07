package HomeWork_10;

public class Task4 {
    //Напишите класс Counter (Task4) с методом increment, увеличивающим значение
    //счётчика. Создайте два потока, каждый из которых вызывает increment() 1000
    //раз. Обеспечьте корректную работу с помощью synchronized.


    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return this.count;
    }

    public static void main(String[] args) throws InterruptedException {
        Task4 counter = new Task4();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());


    }



}
