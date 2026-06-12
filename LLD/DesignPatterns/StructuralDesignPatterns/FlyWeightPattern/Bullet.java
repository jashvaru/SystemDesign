package LLD.DesignPatterns.StructuralDesignPatterns.FlyWeightPattern;

public class Bullet {
    
    //Intrinsic property
    private BulletType bulletType;

    //Extrinsic property
    private int x;
    private int y;

    Bullet(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.bulletType = BulletTypeFactory.getBulletType(color);
    }

    public void display() {
        System.out.println("Bullet at x = " + x + " y = " + y + " & color = " + bulletType.getColor());
    }

}
