package LLD.DesignPatterns.CreationalDesignPatterns.FactoryPattern;

public class Client {
    
    public static void main(String[] args) {
        /* 
        The creation of the object is handled by Transport factory 
        hence decopling client from the object creation process.

        It also shift the object creation responsibility to the factory class
        */

        Transport transport = TransportFactory.createTransportation("bike");
        transport.deliver();

        transport = TransportFactory.createTransportation("car");
        transport.deliver();
    }
}
