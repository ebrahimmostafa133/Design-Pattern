public class LuxuryHouseBuilder implements HouseBuilder {
    private House house;

    public LuxuryHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Deep pile foundation with concrete and waterproofing");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Steel and reinforced concrete structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Solar tile roof with integrated insulation");
    }

    @Override
    public void buildInterior() {
        house.setInterior("High-end finishings: marble floors, smart home systems");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
