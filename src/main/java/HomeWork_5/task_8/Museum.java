package HomeWork_5.task_8;

public class Museum {
    private Exhibit exhibit;


    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    void printIfo(){
        exhibit.printInfo();
    }

     void manage(){
        exhibit.manage();
    }
}
