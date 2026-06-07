package LLD.DesignPatterns.BehaviouralDesignPatterns.MediatorPattern;

public class Client {
    
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User jay = new User("Jay", chatRoom);
        User jash = new User("Jash", chatRoom);
        User mohan = new User("Mohan", chatRoom);

        chatRoom.addUsers(jay);
        chatRoom.addUsers(jash);
        chatRoom.addUsers(mohan);

        mohan.sendMsg("Aur bantai");
    }
}
