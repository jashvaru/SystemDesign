package LLD.DesignPatterns.BehaviouralDesignPatterns.TemplatePattern;

public class Client {

    public static void main(String[] args) {
        Parser csvParser = new CSVParser();
        Parser jsonParser = new JSONParser();

        csvParser.parse();
        jsonParser.parse();
    }
    
}
