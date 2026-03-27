public class ConcreteProductB1 implements AbstractProductB {
    @Override
    public String usefulFunctionB() {
        return "Result of the ProductB1";
    }

    @Override
    public String anotherUsefulFunctionB(AbstractProductA collaborator) {
        return "ProductB1 collaborating with (" + collaborator.usefulFunctionA() + ")";
    }

    @Override
    public String toString() {
        return "ConcreteProductB1@" + System.identityHashCode(this);
    }
}
