package HomeWork_7_demo.generics;

public class Pair<T , M>{

    private T item1;
    private M item2;

    public T getItem1() {
        return item1;
    }

    public M getItem2() {
        return item2;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(M item2) {
        this.item2 = item2;
    }
}
