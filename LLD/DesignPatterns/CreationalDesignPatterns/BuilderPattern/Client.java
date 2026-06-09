package LLD.DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        House house = House.builder()
                .foundation("concrete")
                .roof("grass")
                .walls("cement")
                .garage(false)
                .swimmingPool(true)
                .build();

        System.out.println(house);
    }
}
