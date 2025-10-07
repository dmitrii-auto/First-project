package practice_10.multithreads;

public class TreadSum implements Runnable{

    private final int[] array;
    private final int start;
    private final int end;
    private int summ = 0;

    public TreadSum(int[] array, int start, int end){
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getSumm(){
        return  this.summ;
    }


    @Override
    public void run(){
        for (int i = start; i < end; i++){
            summ += array[i];
        }
    }



}
