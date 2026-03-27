public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation with rebar");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wooden framing");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Asphalt shingles");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Painted walls and basic fixtures");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
