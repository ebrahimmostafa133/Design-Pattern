public class StateDemo {
    public static void main(String[] args) {
        System.out.println("=== State Demo ===");
        Context ctx = new Context(new ConcreteStateA());
        ctx.request();
        ctx.request();
    }
}
