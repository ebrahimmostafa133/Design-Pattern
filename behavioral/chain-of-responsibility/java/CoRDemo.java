public class CoRDemo {
    public static void main(String[] args) {
        System.out.println("=== Chain of Responsibility Demo ===");
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setNext(h2);

        h1.handle(5);
        h1.handle(15);
    }
}
