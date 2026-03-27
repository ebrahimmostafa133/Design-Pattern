public class FactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Demo ===");

        Creator creatorA = new ConcreteCreatorA();
        System.out.println(creatorA.someOperation());

        Creator creatorB = new ConcreteCreatorB();
        System.out.println(creatorB.someOperation());

        System.out.println("Direct product instances:");
        System.out.println(creatorA.factoryMethod());
        System.out.println(creatorB.factoryMethod());
    }
}
