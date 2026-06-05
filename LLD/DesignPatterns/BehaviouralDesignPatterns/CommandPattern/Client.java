package LLD.DesignPatterns.BehaviouralDesignPatterns.CommandPattern;

public class Client {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Button button = new Button();

        button.setCommand(new BoldCommand(editor));
        button.onClick();    

        button.setCommand(new ColorCommand(editor));
        button.onClick();
    }

}
