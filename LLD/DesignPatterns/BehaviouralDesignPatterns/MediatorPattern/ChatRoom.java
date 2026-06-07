package LLD.DesignPatterns.BehaviouralDesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }


    @Override
    public void sendMsg(String msg, User sender) {
        for (User user : users) {
            if(user!=sender) {
                user.receiveMsg(msg, sender);
            }
        }
    }

    @Override
    public void addUsers(User user) {
        users.add(user);
    }
    
}
