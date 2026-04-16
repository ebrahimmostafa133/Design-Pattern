public class ConcretePrototype implements Prototype, Cloneable {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clonePrototype() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ConcretePrototype(this.name);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{name='" + name + "'}";
    }
}
