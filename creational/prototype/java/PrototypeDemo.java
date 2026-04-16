public class PrototypeDemo {
    public static void main(String[] args) {
        System.out.println("=== Prototype Demo ===");

        ConcretePrototype original = new ConcretePrototype("Original");
        ConcretePrototype copy = (ConcretePrototype) original.clonePrototype();

        System.out.println("Original: " + original);
        System.out.println("Copy:     " + copy);
        System.out.println("Same object? " + (original == copy));
    }
}
