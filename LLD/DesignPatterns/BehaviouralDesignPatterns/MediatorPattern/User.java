package LLD.DesignPatterns.BehaviouralDesignPatterns.MediatorPattern;

public class User {
    
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return this.name;
    }

    public void sendMsg(String msg) {
        System.out.println(this.name + " sending '" + msg + "'");
        chatMediator.sendMsg(msg, this);
    }

    public void receiveMsg(String msg, User sender) {
        System.out.println(this.name + " received '" + msg + "' from " + sender.getName());
    }
}
