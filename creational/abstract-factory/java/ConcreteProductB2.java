public class ConcreteProductB2 implements AbstractProductB {
    @Override
    public String usefulFunctionB() {
        return "Result of the ProductB2";
    }

    @Override
    public String anotherUsefulFunctionB(AbstractProductA collaborator) {
        return "ProductB2 collaborating with (" + collaborator.usefulFunctionA() + ")";
    }

    @Override
    public String toString() {
        return "ConcreteProductB2@" + System.identityHashCode(this);
    }
}
