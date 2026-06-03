public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setContent("Hello, Jash!");
        caretaker.saveState(textEditor);
        System.out.println(textEditor.getContent());

        textEditor.setContent("Hello, Jay!");
        caretaker.saveState(textEditor);
        System.out.println(textEditor.getContent());

        textEditor.setContent("Hello, Mohan!");
        caretaker.saveState(textEditor);
        System.out.println(textEditor.getContent());

        caretaker.undoState(textEditor);
        System.out.println(textEditor.getContent());

        caretaker.undoState(textEditor);
        System.out.println(textEditor.getContent());

    }
}