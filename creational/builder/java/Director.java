public class Director {
    private final HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    // The director controls the order of building steps
    public void constructHouse() {
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildRoof();
        builder.buildInterior();
    }

    public House getHouse() {
        return builder.getHouse();
    }
}
