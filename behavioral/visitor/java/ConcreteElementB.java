public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) { visitor.visitConcreteElementB(this); }

    public String operationB() { return "ElementB operation"; }
}
