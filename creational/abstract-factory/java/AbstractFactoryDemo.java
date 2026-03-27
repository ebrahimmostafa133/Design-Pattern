public class AbstractFactoryDemo {
    private static void clientCode(AbstractFactory factory) {
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        System.out.println(productB.usefulFunctionB());
        System.out.println(productB.anotherUsefulFunctionB(productA));
    }

    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Demo ===");

        System.out.println("Client: Testing with ConcreteFactory1");
        clientCode(new ConcreteFactory1());

        System.out.println("Client: Testing with ConcreteFactory2");
        clientCode(new ConcreteFactory2());
    }
}
