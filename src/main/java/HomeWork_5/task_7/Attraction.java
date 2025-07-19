package HomeWork_5.task_7;

public abstract class Attraction {
    String description;

     public Attraction(String description){
        this.description = description;
    }

    abstract void printIfo();
     abstract void service();
}
