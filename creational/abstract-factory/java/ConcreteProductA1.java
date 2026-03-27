public class ConcreteProductA1 implements AbstractProductA {
    @Override
    public String usefulFunctionA() {
        return "Result of the ProductA1";
    }

    @Override
    public String toString() {
        return "ConcreteProductA1@" + System.identityHashCode(this);
    }
}
