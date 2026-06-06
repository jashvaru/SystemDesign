package LLD.DesignPatterns.BehaviouralDesignPatterns.TemplatePattern;

public abstract class Parser {

    public void parse() {
        openFile();
        parseData();
        closeFile();

    }
    
    public void openFile() {
        System.out.println("Opening the file");
    }

    public void closeFile() {
        System.out.println("Closing the file");
    }

    public abstract void parseData();    
}
