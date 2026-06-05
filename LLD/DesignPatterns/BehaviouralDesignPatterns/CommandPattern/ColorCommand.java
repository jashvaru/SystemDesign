package LLD.DesignPatterns.BehaviouralDesignPatterns.CommandPattern;

public class ColorCommand implements Command {

    private TextEditor editor;

    public ColorCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.colorText();
    }
    
}
