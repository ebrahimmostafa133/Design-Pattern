public class ConcreteProductA2 implements AbstractProductA {
    @Override
    public String usefulFunctionA() {
        return "Result of the ProductA2";
    }

    @Override
    public String toString() {
        return "ConcreteProductA2@" + System.identityHashCode(this);
    }
}
