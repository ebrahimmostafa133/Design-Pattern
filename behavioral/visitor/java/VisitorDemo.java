public class VisitorDemo {
    public static void main(String[] args) {
        System.out.println("=== Visitor Demo ===");
        Element[] elements = { new ConcreteElementA(), new ConcreteElementB() };
        ConcreteVisitor visitor = new ConcreteVisitor();
        for (Element e : elements) e.accept(visitor);
    }
}
