package HomeWork_7.generics;

public class Pair <T,M>{
    private T element1;
    private M element2;

    public M getElement2() {
        return element2;
    }

    public T getElement1() {
        return element1;
    }

    public void setElement1(T element1) {
        this.element1 = element1;
    }

    public void setElement2(M element2) {
        this.element2 = element2;
    }
}
