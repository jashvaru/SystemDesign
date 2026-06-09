package LLD.DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class Client {
    private Button button;
    private ScrollBar scrollBar;

    public Client(UIFactory uiFactory) {
        button = uiFactory.createButton();
        scrollBar = uiFactory.createScrollBar();
    }

    public void callUI() {
        button.press();
        scrollBar.render();
    }

    public static void main(String[] args) {
        Client client = new Client(new WinUIFactory());
        client.callUI();

        client = new Client(new MacUIFactory());
        client.callUI();    
    }
}
