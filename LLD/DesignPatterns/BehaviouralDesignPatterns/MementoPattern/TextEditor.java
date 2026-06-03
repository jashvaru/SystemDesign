public class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    //Creates a snapshot of the TextEditor as EditorMemento and returns it
    public EditorMemento save() {
        return new EditorMemento(this.content);
    }

    //Gets restores back the value of the content from the previous EditorMemento
    public void restore(EditorMemento editorMemento) {
        this.content = editorMemento.getContent();
    }

}