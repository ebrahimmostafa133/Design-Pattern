public class ConcreteElementA implements Element {
    public void accept(Visitor visitor) { visitor.visitConcreteElementA(this); }

    public String operationA() { return "ElementA operation"; }
}
