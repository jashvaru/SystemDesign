package LLD.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Sending mail using EmailNotificationService");
        System.out.println("To - " + to);
        System.out.println("Subject - " + subject);
        System.out.println("Body - " + body);
    }
    
}
