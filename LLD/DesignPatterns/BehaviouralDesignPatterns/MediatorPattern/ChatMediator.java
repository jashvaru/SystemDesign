package LLD.DesignPatterns.BehaviouralDesignPatterns.MediatorPattern;

public interface ChatMediator {
    
    public void sendMsg(String msg, User user);

    public void addUsers(User user);

}
