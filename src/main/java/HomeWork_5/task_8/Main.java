package HomeWork_5.task_8;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        Museum manager = new Museum();

        manager.setExhibit(sculpture);
        manager.printIfo();
        manager.manage();

//        manager.setExhibit(manuscript);
//        manager.printIfo();
//        manager.manage();

    }
}
