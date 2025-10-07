package practice_10.synchronizedkeyword;

public class SafeCounter {
    // методы по увеличению и уменьшению значения
    // задача реализовать решение в многопоточной среде

    private int count = 0;

    public synchronized void increnment(){
        this.count++;
    }

    public synchronized void decrenment(){
        this.count--;
    }

    public synchronized int getCount(){
        return this.count;
    }

}
