public class LiteralExpression implements Expression {
    private final int value;

    public LiteralExpression(int value) { this.value = value; }

    @Override
    public int interpret() { return value; }
}
