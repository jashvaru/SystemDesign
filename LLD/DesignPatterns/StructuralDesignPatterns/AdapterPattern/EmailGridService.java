package LLD.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class EmailGridService {

    public void sendEmail(String recipient, String title, String content) {
        System.out.println("Sending mail using EmailGridService");
        System.out.println("Recipient - " + recipient);
        System.out.println("Title - " + title);
        System.out.println("Content - " + content);
    }

}
