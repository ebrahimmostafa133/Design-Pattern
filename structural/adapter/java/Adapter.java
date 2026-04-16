public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        // translate the adaptee's interface to the target
        return "Adapter: (translated) " + adaptee.specificRequest();
    }
}
