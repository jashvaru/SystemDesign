package LLD.DesignPatterns.StructuralDesignPatterns.FacadePattern;

public class Client {
    
    public static void main(String[] args) {
        /*  
        APIGateway acts as a facade between client and microservices.
        Client only need to know details about APIGateway and not care about services implementation
        */
    
        APIGateway apiGateway = new APIGateway();
        System.out.println(apiGateway.getAllDetails("123", "456", "Jash"));
    }
}
