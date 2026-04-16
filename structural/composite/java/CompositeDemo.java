public class CompositeDemo {
    public static void main(String[] args) {
        System.out.println("=== Composite Demo ===");
        Composite root = new Composite();
        root.add(new Leaf("A"));
        Composite sub = new Composite();
        sub.add(new Leaf("B1"));
        sub.add(new Leaf("B2"));
        root.add(sub);
        root.print();
    }
}
