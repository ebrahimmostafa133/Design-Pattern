public class StrategyDemo {
    public static void main(String[] args) {
        System.out.println("=== Strategy Demo ===");
        StrategyContext ctx = new StrategyContext(new ConcreteStrategyAdd());
        System.out.println("Add: " + ctx.executeStrategy(3, 4));
        ctx.setStrategy(new ConcreteStrategyMultiply());
        System.out.println("Multiply: " + ctx.executeStrategy(3, 4));
    }
}
