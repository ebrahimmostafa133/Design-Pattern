public class ConcreteVisitor implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA element) {
        System.out.println("Visited A: " + element.operationA());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB element) {
        System.out.println("Visited B: " + element.operationB());
    }
}
