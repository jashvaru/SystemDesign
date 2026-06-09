package LLD.DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class House {
    private String foundation;
    private String roof;
    private String walls;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public House(HouseBuilder houseBuilder) {
        this.foundation = houseBuilder.foundation;
        this.roof = houseBuilder.roof;
        this.walls = houseBuilder.walls;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    @Override public String toString() {
        return "House [foundation=" + foundation + ", roof=" + roof + ", walls=" + walls + ", hasGarage=" + hasGarage
                + ", hasSwimmingPool=" + hasSwimmingPool + "]";
    }

    public static class HouseBuilder {
        private String foundation;
        private String roof;
        private String walls;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

         public HouseBuilder() {
        }

        public HouseBuilder foundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder walls(String walls) {
            this.walls = walls;
            return this;
        }       

        public HouseBuilder garage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder swimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
