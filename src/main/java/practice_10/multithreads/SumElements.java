package practice_10.multithreads;

public class SumElements {
    // посчитать сумму элементов большего массива с помощью разделения на
    // части и использовать несколько потоков


    // разделим массив пополам
    // первый массив от 0 до array.length/2
    // второй массив от array.length/2 + 1 до array.length

    private static final int[] aray = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) throws InterruptedException {
        int summ = parallelSum(aray);
        System.out.println("Сумма: " + summ);
    }

    public static int parallelSum(int[] array) throws InterruptedException {
        int halfSize = array.length / 2;

        TreadSum firstHalf = new TreadSum(array, 0, halfSize);
        TreadSum secondtHalf = new TreadSum(array, halfSize, array.length);

        Thread t1 = new Thread(firstHalf);
        Thread t2 = new Thread(secondtHalf);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        return firstHalf.getSumm() + secondtHalf.getSumm();
    }
}
