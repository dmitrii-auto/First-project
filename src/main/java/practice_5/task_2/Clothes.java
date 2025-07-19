package practice_5.task_2;

public class Clothes extends Item{
    private final static char DEFAULT_SIZE = 'M';
    private int Size;

    public Clothes(String name, double price, int count) {
        super(name, price, count);
        this.Size = DEFAULT_SIZE;
    }

    public int getSize() {
        return Size;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(", размер " + this.Size);
    }

}
