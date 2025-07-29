package practice_6.photo_editor;

import java.util.Stack;

public class PhotoEditor {

    // хранить последнее действие
    private Stack<String> actions;

    public PhotoEditor(){
        this.actions = new Stack<>();
    }

    // добавить действие
    public void addNewActions(String newAction){
        actions.push(newAction);
    }

    // откатить последнее действие
    public void undoLastAction(){
        actions.pop();
    }

    public void printActions(){
        System.out.println("Все действия :");
        actions.forEach( System.out::println);
        System.out.println();
    }

}
