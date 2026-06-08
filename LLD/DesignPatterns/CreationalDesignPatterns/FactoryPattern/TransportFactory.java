package LLD.DesignPatterns.CreationalDesignPatterns.FactoryPattern;

/* 
Consider this as a actual fatory which produces diff 
types of Transport objects

It adheres to Open Close princible where client will not change 
only factory class needs to be change for new transportation type
*/
public class TransportFactory {

    public static Transport createTransportation(String type) {
        switch (type.toLowerCase()) {
            case "bike":
                return new Bike();
            case "car":
                return new Car();
            default:
                throw new IllegalArgumentException("Not a valid input");
        }
    }
    
}
