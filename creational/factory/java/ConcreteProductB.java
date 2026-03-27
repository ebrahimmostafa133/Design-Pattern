public class ConcreteProductB implements Product {
    @Override
    public String use() {
        return "Product B in use";
    }

    @Override
    public String toString() {
        return "ConcreteProductB@" + System.identityHashCode(this);
    }
}
