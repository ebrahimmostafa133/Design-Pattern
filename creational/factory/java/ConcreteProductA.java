public class ConcreteProductA implements Product {
    @Override
    public String use() {
        return "Product A in use";
    }

    @Override
    public String toString() {
        return "ConcreteProductA@" + System.identityHashCode(this);
    }
}
