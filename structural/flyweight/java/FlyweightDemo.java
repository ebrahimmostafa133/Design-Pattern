public class FlyweightDemo {
    public static void main(String[] args) {
        System.out.println("=== Flyweight Demo ===");
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fw1 = factory.getFlyweight("X");
        Flyweight fw2 = factory.getFlyweight("X");
        System.out.println(fw1.operation("extrinsic1"));
        System.out.println(fw2.operation("extrinsic2"));
        System.out.println("Same instance? " + (fw1 == fw2));
    }
}
