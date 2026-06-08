package LLD.DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class Client {
    
    public static void main(String[] args) {
        AppSettings appSettings1 = AppSettings.getInstance();
        AppSettings appSettings2 = AppSettings.getInstance();

        System.out.println(appSettings1.getDbURL());
        System.out.println(appSettings2.getDbURL());
        System.out.println(appSettings1==appSettings2);
    }
}
