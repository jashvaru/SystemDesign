package LLD.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class EmailServiceAdapter implements NotificationService {
    private EmailGridService emailGridService;

    EmailServiceAdapter(EmailGridService emailGridService) {
        this.emailGridService = emailGridService;
    } 

    @Override
    public void send(String to, String subject, String body) {
        emailGridService.sendEmail(to, subject, body);
    }
    
}
