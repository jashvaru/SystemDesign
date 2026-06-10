package LLD.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class Client {

    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        notificationService.send("Jash", "Promotion", "Congrats");

        /* EmailGridService emailGridService = new EmailGridService();
        emailGridService.sendEmail("Jash", "Promotion", "Congrats"); */

        /*Instead of creating new instance of Email grid service our code will still call
        notificationService.send() hence no change in existing code, only adaptation that
        need to be done here is change the reference from EmailNotificationService to 
        EmailAdaptarService which will internally adapt to call EmailGridService method*/
        notificationService = new EmailServiceAdapter(new EmailGridService());
        notificationService.send("Jash", "Promotion", "Congrats");
    }
}
