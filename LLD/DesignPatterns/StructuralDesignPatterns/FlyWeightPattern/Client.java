package LLD.DesignPatterns.StructuralDesignPatterns.FlyWeightPattern;

public class Client {
    
    public static void main(String[] args) {

        /* 
        Propery color is stored in BulletTypeFactory and have only two types
        RED and GREEN even though we created 3 bullets.
        This saves our memory.
        */

        Bullet bullet1 = new Bullet(1, 2, "RED");
        Bullet bullet2 = new Bullet(1, 2, "RED");
        Bullet bullet3 = new Bullet(1, 2, "GREEN");

        bullet1.display();
        bullet2.display();
        bullet3.display();
    }
}
