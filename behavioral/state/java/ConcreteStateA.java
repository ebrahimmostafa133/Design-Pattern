public class ConcreteStateA implements State {
    @Override
    public void handle(Context ctx) {
        System.out.println("State A handling request and switching to B");
        ctx.setState(new ConcreteStateB());
    }
}
