public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("=== Classic Builder + Director Example ===");

        HouseBuilder simpleBuilder = new ConcreteHouseBuilder();
        Director director = new Director(simpleBuilder);
        director.constructHouse();
        House simpleHouse = director.getHouse();
        System.out.println("Simple house built: " + simpleHouse);

        HouseBuilder luxuryBuilder = new LuxuryHouseBuilder();
        Director luxuryDirector = new Director(luxuryBuilder);
        luxuryDirector.constructHouse();
        System.out.println("Luxury house built: " + luxuryDirector.getHouse());
    }
}
