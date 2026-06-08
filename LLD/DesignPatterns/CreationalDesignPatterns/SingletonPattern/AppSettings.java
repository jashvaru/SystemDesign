package LLD.DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class AppSettings {
    private static AppSettings appSettingsInstance;

    private String dbURL;
    private String dbPassword;
    
    private AppSettings() {
        dbURL = "abcd";
        dbPassword = "1234";
    }

    /* 
    Returns only single instance of AppSettings not matter 
    how many time getInstance method is called 
    */
    public static AppSettings getInstance() {
        if(appSettingsInstance==null) {
            appSettingsInstance = new AppSettings();
        }
        return appSettingsInstance;
    }

    //Keep only getter as values would be set from config file
    public String getDbURL() {
        return dbURL;
    }

    public String getDbPassword() {
        return dbPassword;
    }

}
