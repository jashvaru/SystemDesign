package LLD.DesignPatterns.StructuralDesignPatterns.ProxyPattern;

public class Client {
    public static void main(String[] args) {
        /* 
        In below code at the time of creating instance for real object
        img is loading from disk and then displayed.
        Also if I create a new instance of the RealImage the image will
        load from the disk again.
        */
        /* Image img1 = new RealImage("jash.png");
        Image img2 = new RealImage("jash.png");

        img1.display();
        img2.display(); */

        /* 
        Proxy pattern helps to create the instance of the img with only name
        and the img loads from the disk only when display() is called this is "Lazy Loading".
        Here on the first load we keep the instance of the RealImage,
        so if display is called again it will not load RealImage again but use earlier reference
        this helps with caching.
        */

        Image img1 = new ProxyImage("jash.png");

        img1.display();
        img1.display();
    }
}
