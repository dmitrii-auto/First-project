package HomeWork_5.task_8;

public abstract class Exhibit {
    protected String history;

    public Exhibit(String history) {
        this.history = history;
    }

    abstract void printInfo();
    abstract void manage();
}
