package practice_6.photo_editor;

public class Main {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.addNewActions("Корректировка глаз");
        photoEditor.addNewActions("Корректировка ушей");
        photoEditor.addNewActions("Корректировка носа");
        photoEditor.addNewActions("Корректировка тела");

        photoEditor.printActions();

        photoEditor.undoLastAction();
        photoEditor.printActions();

        photoEditor.undoLastAction();
        photoEditor.printActions();


    }
}
