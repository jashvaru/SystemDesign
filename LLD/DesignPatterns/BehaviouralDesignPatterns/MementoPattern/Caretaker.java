//Caretaker class: Manages the memento's (snapshots) of the text editor's class
import java.util.Stack;

public class Caretaker {
    private Stack<EditorMemento> history = new Stack<>();

    //It saves the Editor Memento in the stack
    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    //It pop the Editor Memento from the stack and gets the top most editor Memento
    public void undoState(TextEditor textEditor) {
        if(!history.isEmpty()) {
            history.pop();
            textEditor.restore(history.peek());
        }
    }
}
