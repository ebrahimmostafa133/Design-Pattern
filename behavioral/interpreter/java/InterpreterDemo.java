public class InterpreterDemo {
    public static void main(String[] args) {
        System.out.println("=== Interpreter Demo ===");
        Expression five = new LiteralExpression(5);
        Expression seven = new LiteralExpression(7);
        Expression sum = new AddExpression(five, seven);
        System.out.println("5 + 7 = " + sum.interpret());
    }
}
